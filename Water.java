import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Water here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Water extends blocks
{

    public void act() 
    {
        setImage("/sprites/blocks/sea.png");
        
    if (isTouching(Character.class))
    {
        removeTouching(Character.class);
        Greenfoot.setWorld(new GameOver());
    }
    }    
}
