import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class LevelMenu extends World
{
    GifImage bg = new GifImage("menu/bg.gif");

    public LevelMenu()
    {    
        super(1032, 624, 1); 
        prepare();
    }

    public void act()
    {
        setBackground(bg.getCurrentImage());
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Level1Button level1Button = new Level1Button();
        addObject(level1Button,95,101);
        level1Button.setLocation(144,63);
        level1Button.setLocation(98,67);
    }
}
