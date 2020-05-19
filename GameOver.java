import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{

    public GameOver()
    {    
        super(1032, 624, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        GoBackToMenu goBackToMenu = new GoBackToMenu();
        addObject(goBackToMenu,85,586);
        goBackToMenu.setLocation(102,589);
    }
}
