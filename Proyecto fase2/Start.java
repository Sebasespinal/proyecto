import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Este es el inicio del juego
 * 
 * @author Gerardo Fernandez
 * @version (a version number or a date)
 */
public class Start extends World
{
    /**
     * Constructor for objects of class Start.
     * 
     */
    public Start()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1); 
        prepare();
    }
    
    /**
     * Prepara al mundo para el inicio del programa.
     * Es decir: crear los objetos iniciales y agregarlos al mundo.
     */
    private void prepare()
    {
        Dog dog = new Dog();
        addObject(dog, 250, 117);
        dog.setLocation(650,350);
        
    }
}
