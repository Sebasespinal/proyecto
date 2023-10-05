import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BolsasPL here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BolsasPL extends Waste
{
    public BolsasPL(){
        setType(1);
        setName("Bolsa de Plastico");
        setOrganic(false);
        setRecycle(false);
        
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 525, image.getHeight() - 675);
        setImage(image);
    }
    
    /**
     * Act - do whatever the BolsasPL wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        DragAndDrop();
        AutomaticMovement();
        DetectEnd();
    }
}
