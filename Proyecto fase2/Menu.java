import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Menu interactivo para el jugador
 * 
 * @author (Gerardo Fernandez) 
 * @version (a version number or a date)
 */
public class Menu extends World
{

    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1); 
        prepare();
    }
    
    /**
     * Prepara al mundo para el inicio del programa.
        Es decir: crear los objetos iniciales y agregarlos al mundo.
     */
    private void prepare()
    {
        Dog2 dog2 = new Dog2();
        addObject(dog2, 250, 117);
        dog2.setLocation(668,327);

        Dog3 dog3 = new Dog3();
        addObject(dog3, 250, 117);
        dog3.setLocation(288,357);
               
        Scores score = new Scores();
        addObject(score,506,314);
        score.setLocation(475,525);
    }
}
