import greenfoot.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Level1Unlocked extends Actor
{
    GreenfootImage button = new GreenfootImage("levels/level1.png");
    Levels world = null;
    
    public Level1Unlocked()
    {
        setImage(button);
    }
    public void act() 
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if (mouse != null) {
            button.scale(165, 55);
            List objects = getWorld().getObjectsAt(mouse.getX(), mouse.getY(), Level1Unlocked.class);
            for (Object object : objects)
            {
                if (object == this)
                {
                    button.scale(248, 83);
                    if(Greenfoot.mouseClicked(this))
                    {
                        //Menu world = (Menu) getWorld();
                        //world.sound.stop();
                        Greenfoot.setWorld(new Level1());   
                    }
                }
            }
        }
    }
}
