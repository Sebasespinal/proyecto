import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dog2 here.
 * 
 * @author (Gerardo Fernandez) 
 * @version (a version number or a date)
 */
public class Dog2 extends Actor
{
    /**
     * Act - do whatever the Dog2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.mousePressed(this))
        {
            Greenfoot.setWorld(new Juego());
        }
    }
}
