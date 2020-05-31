import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Water extends Blocks
{
    public void act() 
    {
        setImage("sprites/blocks/sea.png");
        
        if(isTouching(Character.class) && !Star.win)
        {
            removeTouching(Character.class);
            Greenfoot.setWorld(new GameOver());
        }
    }    
}
