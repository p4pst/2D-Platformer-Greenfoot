import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class water extends Scroller
{
    public void act() 
    {
        setImage("sprites/blocks/sea.png");
        
        if(isTouching(Character.class))
        {
            removeTouching(Character.class);
            Greenfoot.setWorld(new GameOver());
        }
    }    
}
