;import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Enemy extends Actor
{
    int speed = -3;
    int counter = 0;
    public void act() 
    {
       counter++;
       moveAround();
    }  
    
    public void moveAround()
    {
        if(counter < 25)
        {
            setLocation(getX() + speed, getY());
        }
        else{
            speed =- speed;
            counter = 0;
        }
        
        if(isTouching(Bullet.class))
        {
            getWorld().removeObject(this);
        }
    
    }
}
