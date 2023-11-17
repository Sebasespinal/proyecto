import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;
/**
 * Pantalla del juego, donde unicamente se encuentran los elemetos visuales 
 * del juego.
 * 
 * @author (Gerardo Fernandez)
 * @version (a version number or a date)
 */
public class Juego extends World
{
    private int lives = 3;
    private int score;
    public static String name = null;
    private ClasifControll Controller = new ClasifControll();
    private boolean nameRequested = false;
    private Lives vidas;
    private Lives vidas1;
    private Lives vidas2;
    
    /**
     * Constructor for objects of class Juego.
     * 
     */
    public Juego()
    {    
        super(900, 600, 1); 
        if (!nameRequested && name == null) {
            name = JOptionPane.showInputDialog("Ingrese su nombre");
            nameRequested = true;
        }
        prepare();
        setScore(0);
        showLives();
    }
    
    public int getScore(){
        return score;
    }
    
    public void setScore(int thescore){
        score = thescore;
    }
    
    public int getLives(){
        return lives;
    }
    
    public void setLives(int thelives){
    lives = thelives;
    if (lives < 3) {
        removeObject(vidas);
        vidas = null;
    }
    if (lives < 2) {
        removeObject(vidas1);
        vidas1 = null;
    }
    if (lives < 1) {
        removeObject(vidas2);
        vidas2 = null;
    }
    }
    
    /**
     * Act metodo que revisa cuantas vidas tiene el jugador, si es igual a 0 produce un 
     * sonido y finaliza el juego.
     */
    public void act()
    {
        Controller.checkLivesAndGameOver(this);
        Controller.SpawnNewWaste(this);
        ShowScore();
    }
    
    /**
     * Metodo para mostrar el score
     */
    public void ShowScore(){
        showText("Puntaje: "+ score, 750, 125);
    }   

    private void showLives() {
    vidas = new Lives();
    vidas1 = new Lives();
    vidas2 = new Lives();
    vidas.getImage().scale(vidas.getImage().getWidth() / 5, vidas.getImage().getHeight() / 5);
    vidas1.getImage().scale(vidas1.getImage().getWidth() / 5, vidas1.getImage().getHeight() / 5);
    vidas2.getImage().scale(vidas2.getImage().getWidth() / 5, vidas2.getImage().getHeight() / 5);
    addObject(vidas, 748, 65);
    addObject(vidas1, 700, 85);  
    addObject(vidas2, 800, 85); 
    }  

    /**
     * Prepara al mundo para el inicio del programa.
     * Es decir: crear los objetos iniciales y agregarlos al mundo.
     */
    private void prepare()
    {
        Organic organic = new Organic();
        addObject(organic,150,289);

        Recyclable recyclable = new Recyclable();
        addObject(recyclable,411,290);

        NonRecyclable nonRecyclable = new NonRecyclable();
        addObject(nonRecyclable,318,292);

        organic.setLocation(630,400);
        showText(""+ organic.getLabel(), organic.getX(), organic.getY());
        
        recyclable.setLocation(440,400);
        showText(""+ recyclable.getLabel(), recyclable.getX(), recyclable.getY());
        
        nonRecyclable.setLocation(250,400);
        showText(""+ nonRecyclable.getLabel(), nonRecyclable.getX(), recyclable.getY());
        }
}