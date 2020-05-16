import greenfoot.*;
import java.util.List;

public class playbutton extends Actor
{
    GreenfootImage button = new GreenfootImage("menu/playButton.png");
    
    public playbutton()
    {
        setImage(button);
    }
    public void act() 
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if (mouse != null) {
            button.scale(165, 55);
            List objects = getWorld().getObjectsAt(mouse.getX(), mouse.getY(), playbutton.class);
            for (Object object : objects)
            {
                if (object == this)
                {
                    button.scale(248, 83);
                }
            }
        }
    }
}
