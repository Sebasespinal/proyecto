import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instrucciones here.
 * 
 * @author (Gerardo Fernandez) 
 * @version (a version number or a date)
 */
public class Instrucciones extends World
{

    /**
     * Constructor for objects of class Instrucciones.
     * 
     */
    public Instrucciones()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1); 
        prepare();
    }
    
    private void prepare()
    {
        GameSB sGame = new GameSB();
        addObject(sGame, 250, 117);
        sGame.setLocation(465,450);
        
        BotonMenu dog = new BotonMenu();
        addObject(dog,506,314);
        dog.setLocation(100,530);
    }
}
