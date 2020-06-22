import greenfoot.*;
import java.util.List;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level3Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level3Button extends Actor
{
    GreenfootImage button = new GreenfootImage("levels/level3.png");
    public Level3Button()
    {
        setImage(button);
    }
    public void act() 
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if (mouse != null) {
            button.scale(165, 55);
            List objects = getWorld().getObjectsAt(mouse.getX(), mouse.getY(), Level3Button.class);
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
            Greenfoot.setWorld(new Level3());
            Menu.sound.stop();
            button.scale(165, 55);
        }
    }   
}
