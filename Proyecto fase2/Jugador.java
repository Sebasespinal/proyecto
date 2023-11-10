import greenfoot.*; 
/**
 * Logica del juego, donde esta hecha la clasificacion de los desperdicios
 * 
 * @author (Gerardo Fernandez) 
 * @version (a version number or a date)
 */
public class Jugador extends Actor  
{
    private int timer = 7250;
    private int lives = 3;
    private int score;
    public static String name = null;

    /**
     * Constructor for objects of class Jugador
     */
    public Jugador(String name, int inicialLives) {
        this.name = name;
        this.lives = inicialLives;
        this.score = 0;
    }
    
    public int getLives() {
        return lives;
    }

    public void perderLives() {
        lives--;
    }

    public int getScore() {
        return score;
    }

    public void aumentarScore(int puntos) {
        score += puntos;
    }

    public String getName() {
        return name;
    }
}
