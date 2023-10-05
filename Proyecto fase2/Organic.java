import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Class for bins that will contain organic wastes
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Organic extends Bins
{
    public Organic(){
        setType(0);
        setLabel("Organico");
        
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 250, image.getHeight() - 350);
        setImage(image);
    }
    
    /**
     * Detecting collisions constantly in game
     */
    public void act()
    {
        DetectWaste();
    }
}
