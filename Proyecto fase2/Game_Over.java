import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;
/**
 * Write a description of class Game_Over here.
 * 
 * @author (Gerardo Fernandez) 
 * @version (a version number or a date)
 */
public class Game_Over extends World
{
    private int FinalScore;
    /**
     * Constructor for objects of class Game_Over.
     * 
     */
    public Game_Over(int score)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1); 
        FinalScore = score;
        prepare();
    }

    public void act()
    {
        String name = Juego.name;
        if (name != null) {
            showText("Jugador/a: " + name, 295, 250);
        }
        showText("Puntaje: " + FinalScore, 290, 300);
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        BotonMenu dog = new BotonMenu();
        addObject(dog,506,314);
        dog.setLocation(775,525);
        
        Scores score = new Scores();
        addObject(score,506,314);
        score.setLocation(575,525);
    }

}
    
    