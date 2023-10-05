import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Electronicos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Electronicos extends Waste
{
    public Electronicos(){
        setType(3);
        setName("Electronicos");
        setOrganic(false);
        setRecycle(true);
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 300, image.getHeight() - 330);
        setImage(image);
    }
    
    /**
     * Act - do whatever the Electronicos wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        DragAndDrop();
        AutomaticMovement();
        DetectEnd();
    }
}
