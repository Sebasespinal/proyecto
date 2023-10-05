import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ceramica here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ceramica extends Waste
{
    public Ceramica(){
        setType(2);
        setName("Ceramica");
        setOrganic(false);
        setRecycle(false);
        
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 420, image.getHeight() - 450);
        setImage(image);
    }
    
    /**
     * Act - do whatever the Ceramica wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
       DragAndDrop();
       AutomaticMovement();
       DetectEnd();
    }
}
