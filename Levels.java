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

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Level1Unlocked level1Unlocked = new Level1Unlocked();
        addObject(level1Unlocked,118,64);
        level1Unlocked.setLocation(125,77);
        level1Unlocked.setLocation(121,79);
    }
}
