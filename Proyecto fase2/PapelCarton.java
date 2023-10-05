import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PapelCarton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PapelCarton extends Waste
{
    public PapelCarton(){
        setType(5);
        setName("Papel Carton");
        setOrganic(false);
        setRecycle(true);
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 1150, image.getHeight() - 1225);
        setImage(image);
    }
    
    /**
     * Act - do whatever the PapelCarton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        DragAndDrop();
        AutomaticMovement();
        DetectEnd();
    }
}
