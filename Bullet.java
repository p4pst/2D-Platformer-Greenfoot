import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{
    int speed = 10;
    public void act() 
    {
        setImage("sprites/blocks/mushroom2.png");
        turnToMouse();
        move(speed);
    }    
    
    public void turnToMouse()
    {
        
    }
}
