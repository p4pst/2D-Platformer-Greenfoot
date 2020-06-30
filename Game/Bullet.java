import greenfoot.*;

public class Bullet extends Actor
{
    public static int speed = 10;
    
    public void act() 
    {
        setImage("sprites/blocks/mushroom2.png");
        turnToMouse();
        move(speed);
        
        if(isTouching(Blocks.class))
        {
             getWorld().removeObject(this);
        }
    }    
    
    public void turnToMouse()
    {
    }
}
