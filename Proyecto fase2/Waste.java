import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Parent class of all type of waste
 * 
 * @author Ricardo Chuy
 * @version (a version number or a date)
 */
public abstract class Waste extends Actor
{
    private String Name;
    private boolean Organic;
    private boolean Recycle;
    private int Type;
    private boolean drag = false;
    private int rx = 0, ry = 0;
    
    /**
     * Act - do whatever the Waste wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    
    /**
     * Makes every type of waste, automatically move 1 unit
     */
    public void AutomaticMovement(){
        move(1);
    }
    
    /**
     * Method that makes possible to drag and drop any kinf of waste
     */
    public void DragAndDrop(){
        if(Greenfoot.mouseDragged(this)){
            MouseInfo mouse = Greenfoot.getMouseInfo();
            if(!drag){
                drag = true;
                rx = getX()- mouse.getX();
                ry = getY()- mouse.getY();
            }
            else{
                setLocation(mouse.getX()+rx, mouse.getY() +ry);
            }
        }
    }
    
    /**
     * Detection of position, if the objecto its found near the end fo the world
     * it is deleted and poins are substracted also
     */
    public void DetectEnd(){
        World world;
        world = getWorld();
        if(getX() >= world.getWidth() - 10){
            int gameScore = ((Juego)world).getScore();
            ((Juego)world).setScore(gameScore - 50);
            Greenfoot.playSound("WRONG.mp3");
            world.removeObject(this);
            
        }
    }
    
    public int getType(){
        return Type;
    }
    
    public void setType(int type){
        Type = type;
    }
    
    public String getName(){
        return Name;
    }
    
    public void setName(String name){
        Name = name;
    }
    
    public boolean isOrganic(){
        return Organic;
    }
    
    public void setOrganic(boolean organic){
        Organic = organic;
    }
    
    public boolean isRecycle(){
        return Recycle;
    }
    
    public void setRecycle(boolean recycle){
        Recycle = recycle;
    }
}
