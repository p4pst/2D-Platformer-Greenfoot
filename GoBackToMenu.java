import greenfoot.*;
import java.util.List;

public class GoBackToMenu extends Actor
{
    GreenfootImage button = new GreenfootImage("menu/restartButton.png");
    public GoBackToMenu()
    {
        setImage(button);
    }
    public void act() 
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        button.scale(83, 28);
        if (mouse != null) {
            List objects = getWorld().getObjectsAt(mouse.getX(), mouse.getY(), GoBackToMenu.class);
            for (Object object : objects)
            {
                if (object == this)
                {
                    button.scale(125, 42);
                    if(Greenfoot.mouseClicked(this))
                    {
                        Greenfoot.setWorld(new Level1());
                    }
                }
            }
        }
    }
}    