import greenfoot.*;

public class Menu extends World
{
    GifImage bg = new GifImage("menu/bg.gif");
    public Menu()
    {    
        super(1032, 624, 1);
        
        addObject(new playbutton(), 516, 420);
        addObject(new exitbutton(), 516, 500);
        setBackground(bg.getCurrentImage());
        //MusicInMenu();
    }
    
    public void act()
    {
        setBackground(bg.getCurrentImage());
    }
    
    public void MusicInMenu()
    {
       GreenfootSound musicInMenu = new GreenfootSound("menu/soundtrack.mp3");
       musicInMenu.setVolume(10);
       musicInMenu.play(); 
    }

}
