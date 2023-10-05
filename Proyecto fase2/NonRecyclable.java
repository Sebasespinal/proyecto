import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A class that is both a bin and inroganic, and adds the characteristics for
 * a nonREcylable bin, for this kind of objects too.
 * 
 * @author Ricardo Chuy 
 * @version (a version number or a date)
 */
public class NonRecyclable extends Inorganic
{
    public NonRecyclable(){
        super();
        setRecyclable(false);
        setLabel(getLabel() + "\nNo Reciclable");
        
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 770, image.getHeight() - 770);
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
