import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Class that extends from bins, correspondes to inorganic and has 2 toher subclasses
 * Recyclable and NonRecyclable
 * 
 * @author Rene Sebastian
 * @version (a version number or a date)
 */
public class Inorganic extends Bins
{
    private boolean Recyclable;
    
    /**
     * Constructor of the class inorganic
     */
    public Inorganic(){
        setType(1);
        setLabel("");
    }
    
    /**
     * Act - do whatever the Inorganic wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    
    public boolean isRecyclable(){
        return Recyclable;
    }
    
    public void setRecyclable(boolean recycle){
        Recyclable = recycle;
    }
}
