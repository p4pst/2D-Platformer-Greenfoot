import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
public class Level1Button extends Actor
{
    GreenfootImage level1 = new GreenfootImage("menu/level1.png");
    
    
    public Level1Button()
    {
        setImage(level1);
    }
    
    public void act() 
    {
       
       MouseInfo mouse = Greenfoot.getMouseInfo();
       
          if (mouse != null) {
            level1.scale(165, 55);
            List objects = getWorld().getObjectsAt(mouse.getX(), mouse.getY(), Level1Button.class);
            for (Object object : objects)
            {
                if (object == this)
                {
                    level1.scale(248, 83);
                }
            }
        }
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.stop();
            level1.scale(165, 55);
        }
    }    
}
