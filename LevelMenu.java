import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class LevelMenu extends World
{
    GifImage bg = new GifImage("menu/bg.gif");
    
    public LevelMenu()
    {    
        super(1032, 624, 1); 
    }
    
    public void act()
    {
        setBackground(bg.getCurrentImage());
    }
}
