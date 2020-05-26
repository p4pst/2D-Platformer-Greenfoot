import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Carrot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Carrot extends Actor
{
    
    public void act() 
    {
        setImage("carrot/Carrot.png");
        
        if(isTouching(Character.class))
        {
           getWorld().removeObject(this); 
           Level1.carrots++;
        }
    }    
}
