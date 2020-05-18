import greenfoot.*;

public class Levels extends World
{
    GifImage bg = new GifImage("menu/bg.gif");
    
    public Levels()
    {    
        super(1032, 624, 1);
        setBackground(bg.getCurrentImage());
        buildWorld();
    }
    public void buildWorld()
    {
        addObject(new GoBackToMenu(), 60, 605);
    }
    public void act()
    {
        setBackground(bg.getCurrentImage());
    }
    public void started()
    {
        Menu.sound.play();
        Menu.sound.setVolume(40);
    }
    public void stopped()
    {     
        Menu.sound.stop();
    }
    public void gameOver()
    {
        Menu.sound.stop();
    }
}
