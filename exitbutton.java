import greenfoot.*;

public class exitbutton extends Actor
{
    public exitbutton()
    {
        setImage("menu/exitButton.png");
    }
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.stop();
        }
    }    
}
