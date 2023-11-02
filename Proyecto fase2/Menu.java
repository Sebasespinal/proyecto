import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
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
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Dog2 dog2 = new Dog2();
        addObject(dog2, 250, 117);
        dog2.setLocation(508,295);

        Dog3 dog3 = new Dog3();
        addObject(dog3, 250, 117);
        dog3.setLocation(195,296);
        dog3.setLocation(178,301);
        dog3.setLocation(288,357);
        dog2.setLocation(668,327);
        dog3.setLocation(267,307);
        
        Scores score = new Scores();
        addObject(score,506,314);
        score.setLocation(475,525);
    }
}
