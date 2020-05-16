import greenfoot.*;

public class Menu extends World
{
    GifImage bg = new GifImage("menu/bg.gif");
    public Menu()
    {    
        super(1032, 624, 1);
        //Greenfoot.playSound("menu/soundtrack.mp3");
        addObject(new playbutton(), 516, 420);
        addObject(new exitbutton(), 516, 490);
    }
    
    public void act()
    {
        setBackground(bg.getCurrentImage());
    }
}
