import greenfoot.*;

public class Character extends Actor
{  
    GifImage idle = new GifImage("character/idle.gif");
    GifImage run = new GifImage("character/run.gif");
    /*
    private GreenfootImage left1 = new GreenfootImage("Character/left1.png");
    private GreenfootImage left2 = new GreenfootImage("Character/left2.png");
    private GreenfootImage left3 = new GreenfootImage("Character/left3.png");
    private GreenfootImage right1 = new GreenfootImage("Character/right1.png");
    private GreenfootImage right2 = new GreenfootImage("Character/right2.png");
    private GreenfootImage right3 = new GreenfootImage("Character/right3.png");
    */
    
    private int frame = 1;
    public void act() 
    {
        setImage(idle.getCurrentImage());
        
        if(Greenfoot.isKeyDown("d") || Greenfoot.isKeyDown("right"))
        {
           setLocation(getX() + 2, getY());
           setImage(run.getCurrentImage());
           frame++;
         }
        /*if(Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("left"))
        {
           setLocation(getX() - 5, getY());
                if(frame == 1)
                {
                    setImage(left1);
                }
                else if(frame == 2)
                {
                    setImage(left2);
                }
                else if(frame == 3)
                {
                    setImage(left3);
                    frame = 1;
                }
                
                frame++;
         }
         */
        }
    }    

