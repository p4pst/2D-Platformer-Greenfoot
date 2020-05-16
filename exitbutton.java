import greenfoot.*;
import java.util.List;

public class exitbutton extends Actor
{
    GreenfootImage button = new GreenfootImage("menu/exitButton.png");
    public exitbutton()
    {
        setImage(button);
    }
    public void act() 
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if (mouse != null) {
            button.scale(165, 55);
            List objects = getWorld().getObjectsAt(mouse.getX(), mouse.getY(), exitbutton.class);
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
            Greenfoot.stop();
            button.scale(165, 55);
        }
    }    
}
