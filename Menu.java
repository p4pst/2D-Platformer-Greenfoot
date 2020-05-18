import greenfoot.*;

public class Menu extends World
{
    GifImage bg = new GifImage("menu/bg.gif");
    public static GreenfootSound sound = new GreenfootSound("theme_music.mp3");
    public Menu()
    {
        super(1032, 624, 1);
        buildWorld();
    }
    public void buildWorld()
    {
        addObject(new playbutton(), 516, 420);
        addObject(new exitbutton(), 516, 500);
        setBackground(bg.getCurrentImage());
    }
    public void act()
    {
        setBackground(bg.getCurrentImage());
    }   
    public void started()
    {
        sound.play();
        sound.setVolume(40);
    }
    public void stopped()
    {     
        sound.stop();
    }
    public void gameOver()
    {
        sound.stop();
    }
}
