import greenfoot.*; 
import java.util.List; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class howToPlay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class howToPlay extends Actor
{
    GreenfootImage button = new GreenfootImage("howToPlay/howtoplay.png");
    public void act() 
    {
        setImage(button);
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if (mouse != null) {
            button.scale(165, 55);
            List objects = getWorld().getObjectsAt(mouse.getX(), mouse.getY(), howToPlay.class);
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
            Greenfoot.setWorld(new Tutorial());
            button.scale(165, 55);
        }
    }    
}
