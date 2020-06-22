import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Star extends Actor
{
    public static boolean win = false;
    
    public void act() 
    {
        setImage("Star/star.png");
        
        if(isTouching(Character.class))
        {
            getWorld().removeObject(this);
            win = true;
        }
    }    
}
