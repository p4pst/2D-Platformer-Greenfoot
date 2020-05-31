import greenfoot.*; 
import java.util.List; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Level2Button extends Actor
{
    GreenfootImage button = new GreenfootImage("levels/level2.png");
    public Level2Button()
    {
        setImage(button);
    }
    public void act() 
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if (mouse != null) {
            button.scale(165, 55);
            List objects = getWorld().getObjectsAt(mouse.getX(), mouse.getY(), Level2Button.class);
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
            Greenfoot.setWorld(new Level2());
            Menu.sound.stop();
            button.scale(165, 55);
        }
    }    
}    
