import greenfoot.*; 
/**
 * Write a description of class Scoreboard here.
 * 
 * @author (Gerardo Fernandez) 
 * @version (a version number or a date)
 */
public class Scoreboard extends World
{
    /**
     * Constructor for objects of class Scoreboard.
     * 
     */
    public Scoreboard()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1); 
        prepare();
    }
    
    private void prepare()
    {
        BotonMenu dog = new BotonMenu();
        addObject(dog,506,314);
        dog.setLocation(775,525);
    }
}

