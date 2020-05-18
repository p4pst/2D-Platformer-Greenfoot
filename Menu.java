import greenfoot.*;

public class Menu extends World
{
    GifImage bg = new GifImage("menu/bg.gif");
    public Menu()
    {    
        super(1280, 720, 1);
        
        addObject(new playbutton(), 640, 520);
        addObject(new exitbutton(), 640, 600);
        addObject(new worldof(), 200, 400);
        setBackground(bg.getCurrentImage());
        MusicInMenu();
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
