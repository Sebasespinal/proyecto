import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Here we show the strart page
 * 
 * @author Fabi
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
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Dog dog = new Dog();
        addObject(dog, 250, 117);
        dog.setLocation(488,325);
        dog.setLocation(620,385);
        getBackground();
        dog.setLocation(576,371);
        dog.setLocation(626,400);
        dog.setLocation(700,194);
        dog.setLocation(629,371);
        dog.setLocation(647,348);
    }
}
