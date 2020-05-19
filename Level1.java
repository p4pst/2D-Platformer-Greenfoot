import greenfoot.*;

public class Level1 extends World
{
    GreenfootImage bg = new GreenfootImage("sprites/bg.png");
    public Level1()
    {    
        super(1032, 624, 1); 
        prepare();
    }

    public void act()
    {
        setBackground(bg);
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Clouds clouds = new Clouds();
        addObject(clouds,289,194);
        clouds.setLocation(119,105);
        Clouds clouds2 = new Clouds();
        addObject(clouds2,482,212);
        Clouds clouds3 = new Clouds();
        addObject(clouds3,904,84);
    }
}
