import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.sql.*;
/**
 * Write a description of class Game_Over here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game_Over extends World
{
    private int FinalScore;
    private String Name = null;
    private ArrayList<String> Top5 = null;
    
    private Connection conn;
    private String db_server;
    private String db_database;
    private String db_username;
    private String db_password;
    /**
     * Constructor for objects of class Game_Over.
     * 
     */
    public Game_Over(int score)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        FinalScore = score;
        Name = JOptionPane.showInputDialog("Enter your Name");

        prepare();
    }

    public void act()
    {
        if (Name == null)
        {
            Name = JOptionPane.showInputDialog("Enter your Name");
        }

        showText(""+ FinalScore, 290, 155);
        showText(""+ Name, 290, 190);
        
        if (Top5 != null){
            showText(Top5.get(0), 200, 200);
        }
        

    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Dog dog = new Dog();
        addObject(dog,506,314);
    }
    
	public Connection getConnection() throws SQLException 
    {
        String url = "jdbc:mysql://localhost:3306/reciclaje";
        String username = "root";
        String password = "";
        
        System.out.println("Connecting database...");
        
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("Database connected!");
            return connection;
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect the database!", e);
            
        }
        
    }
    public void addScore() {

	try {
	    		conn = getConnection();
            	        String sql = "INSERT INTO `table_leaderboard`(`id`, `name`, `score`)" + " VALUES ( null, ?,?)";
                	                
                            PreparedStatement Stmt = conn.prepareStatement(sql);
                	                
                            Stmt.setString (1, Name);
                            Stmt.setInt (2, FinalScore);
                            
                            Stmt.execute();

	                
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    


    }
    public void Top5Score() {
        
        Statement stmt = null;
        ResultSet rs = null;
        Connection conn;  
        
        Top5.clear();

        try {
	 		conn = getConnection();
	 		rs = stmt.executeQuery("SELECT id, name, score FROM table_leaderboard ORDER BY score DESC LIMIT 5");

	 		while (rs.next()) {	
                    	        int SQ_id = rs.getInt("id");
                    	        String SQ_name = rs.getString("name");
                    	        String SQ_score = rs.getString("score"); 
                    	        Top5.add(SQ_id + " " +SQ_name + " " + SQ_score + " ");
		        }
                        conn.close();
		}
        catch (SQLException e) {
 		// TODO Auto-generated catch block
 		e.printStackTrace();
 	}
    }
}


