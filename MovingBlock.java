import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MovingBlock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MovingBlock extends Blocks
{
    public static int counter = 0;
    public static int speed = -2;
    public void act() 
    {
        setImage("sprites/blocks/ground4.png");
        counter++;
        moveAround();
        
    }
    
    public void moveAround()
    {
        if(counter < 30)
        {
            setLocation(getX() + speed, getY());
        }
        else{
            speed =- speed;
            counter = 0;
        }
    }
}
