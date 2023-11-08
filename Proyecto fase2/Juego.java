import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;
/**
 * Pantalla del juego, donde esta hecha la clasificacion de los desperdicios
 * 
 * @author (Gerardo Fernandez)
 * @version (a version number or a date)
 */
public class Juego extends World
{
    private int timer = 7250;
    private int lives = 3;
    private int score;
    public static String name = null;
    private ClasifControll Controller = new ClasifControll();
    private boolean nameRequested = false;
    
    /**
     * Constructor for objects of class Juego.
     * 
     */
    public Juego()
    {    
        // Create a new world with 900x600 cells with a cell size of 1x1 pixels.
        super(900, 600, 1); 
        if (!nameRequested && name == null) {
            name = JOptionPane.showInputDialog("Ingrese su nombre");
            nameRequested = true;
        }
        prepare();
        setScore(0);
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
    }
    
    /**
     * Act metodo que revisa cuantas vidas tiene el jugador, si es igual a 0 produce un 
     * sonido y finaliza el juego.
     */
    public void act()
    {
        ShowScore();
        SpawnNewWaste();
        if (lives == 0) {
            Greenfoot.playSound("WIN.mp3");
            Greenfoot.setWorld(new Game_Over(score));
        }
    }
    
    /**
     * Metodo para mostrar el score
     */
    public void ShowScore(){
        showText("Puntaje: "+ score, 750, 125);
    }
    
    /**
     * Al obtener un desperdicio aleatorio con el controlador lógico, el mundo agrega este nuevo objeto
     * cuando el módulo 120 del temporizador es igual a 0 (Cada 2 segundos)
     */
    public void SpawnNewWaste(){
        Actor random_Waste = Controller.RandomWasteGenerator();
        timer --;
        if (timer % 120 == 0){
            addObject(random_Waste,10,200);
        }
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
