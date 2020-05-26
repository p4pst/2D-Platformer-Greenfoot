;import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Enemy extends Actor
{
    int speed = -1;
    int counter = 0;
    int frame = 1;
    int animateCounter = 0;
    public void act() 
    {
       counter++;
       moveAround();
       animateCounter++;
       if(animateCounter % 6 == 0)
       {
       if(frame == 1)
       {
           setImage("Enemy05/walk01.png");
       }
       else if(frame == 2)
       {
           setImage("Enemy05/walk02.png");
       }
       else if(frame == 3)
       {
           setImage("Enemy05/walk03.png");
       }
       else if(frame == 4)
       {
           setImage("Enemy05/walk04.png");
       }
       else if(frame == 5)
       {
           setImage("Enemy05/walk05.png");
       }
       else if(frame == 6)
       {
           setImage("Enemy05/walk06.png");
           frame = 1;
       }
       frame++;
       }  
     }
    
    public void moveAround()
    {
        if(counter < 40)
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
