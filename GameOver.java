
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
        super(1032, 624, 1, false); 
        
        Level1.bullets = 3;
        Level1.carrots = 0;
        prepare();
        
    }
    
    public void act()
    {
        setBackground("gameOver/9.jpg");
    }
    

    private void prepare()
    {
        
        GoBackToMenu goBackToMenu = new GoBackToMenu();
        addObject(goBackToMenu,85,586);
        goBackToMenu.setLocation(102,589);
    }
}
