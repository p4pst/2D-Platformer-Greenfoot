import greenfoot.*;

public class YouWon extends World
{
    GifImage bg = new GifImage("YouWon/bg.gif");

    public YouWon()
    {    
        super(1032, 624, 1); 
        prepare();
    }

    public void act()
    {
        setBackground(bg.getCurrentImage());
        getBackground().drawImage(new GreenfootImage("You Won!!!", 100, Color.WHITE, null), 320, 300);
        getBackground().drawImage(new GreenfootImage("Project by: Sebastian Muric, Walter Pichl", 30, Color.WHITE, null), 10, 590);
    }   

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        GoBackToMenu goBackToMenu = new GoBackToMenu();
        addObject(goBackToMenu,934,585);
        goBackToMenu.setLocation(906,581);
        goBackToMenu.setLocation(934,587);
    }
}
