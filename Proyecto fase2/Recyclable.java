import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A class that is both a bin and inroganic, adds the characteristics for
 * a Recylable bin.
 * 
 * @author Ricardo Chuy 
 * @version (a version number or a date)
 */
public class Recyclable extends Inorganic
{
    /**
     * Constructor of the class recyclable
     */
    public Recyclable(){
        super();
        setRecyclable(true);
        setLabel(getLabel() + "\nReciclable");
        
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 925, image.getHeight() - 1175);
        setImage(image);
    }
    
    /**
     * Checking for collisions constantly in game
     */
    public void act()
    {
        DetectWaste();
    }
}
