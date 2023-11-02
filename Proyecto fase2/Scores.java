import greenfoot.*; 
/**
 * Write a description of class Score here.
 * 
 * @author (Gerardo Fernandez) 
 * @version (a version number or a date)
 */
public class Scores extends Actor
{
    /**
     * Act - do whatever the Scores wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
         if (Greenfoot.mousePressed(this))
        {
            Greenfoot.setWorld(new Scoreboard());
        }
    }
}
