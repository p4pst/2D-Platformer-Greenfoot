import greenfoot.*; 
import java.util.List; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Level1Button extends Actor
{
    GreenfootImage button = new GreenfootImage("levels/level1.png");
    public Level1Button()
    {
        setImage(button);
    }
    public void act() 
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if (mouse != null) {
            button.scale(165, 55);
            List objects = getWorld().getObjectsAt(mouse.getX(), mouse.getY(), Level1Button.class);
            for (Object object : objects)
            {
                if (object == this)
                {
                    button.scale(248, 83);
                }
            }
        }
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Level1());
            button.scale(165, 55);
        }
    }    
}    
