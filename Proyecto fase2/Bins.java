import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * Parent Class of types of bins
 * 
 * @author Ricardo Chuy
 * @version (a version number or a date)
 */
public abstract class Bins extends Actor
{
    private int Type;
    private String Label;
    private ArrayList<Waste> WasteInBin = new ArrayList<Waste>();
    private ClasifControll Controller = new ClasifControll();

    /**
     * Act - do whatever the Bins wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){
    }
    
    /**
     * Method for all type of bins that detects contact with a given Waste
     * On contact the waste is deleted and with the logic controller, it is verified
     * if the clasification is correct
     */
    public void DetectWaste(){
        Actor Waste;
        Waste = getOneObjectAtOffset(0, 0, Waste.class);
        
        if (Waste != null){
            World world;
            world = getWorld();
            world.removeObject(Waste);
            
            Controller.IsClassificationCorrect(Waste, this, (Juego)getWorld());
        }
    }
    
    public int getType(){
        return Type;
    }
    
    public void setType(int type){
        Type = type;
    }
    
    public String getLabel(){
        return Label;
    }
    
    public void setLabel(String label){
        Label = label;
    }
    
    public ArrayList<Waste> getWastInBin(){
        return WasteInBin;
    }
    
    public void setWasteInBin(ArrayList<Waste> Objects){
        WasteInBin = Objects;
    }
}
