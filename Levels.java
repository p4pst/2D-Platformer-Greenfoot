import greenfoot.*;

public class Levels extends World
{
    GifImage bg = new GifImage("menu/bg.gif");

    public Levels()
    {    
        super(1032, 624, 1);
        setBackground(bg.getCurrentImage());
        buildWorld();
        prepare();
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
    
    private void prepare()
    {
        Level1Button level1Button = new Level1Button();
        addObject(level1Button,135,92);
        level1Button.setLocation(128,60);
        level1Button.setLocation(119,47);
        GoBackToMenu goBackToMenu = new GoBackToMenu();
        addObject(goBackToMenu,829,519);
        goBackToMenu.setLocation(949,583);
    }
}
