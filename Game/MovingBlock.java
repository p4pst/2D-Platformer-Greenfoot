import greenfoot.*;

public class MovingBlock extends Blocks
{
    public static int counter = 0;
    public static int speed = -2;
    
    public void act() 
    {
        setImage("sprites/blocks/ground4.png");
        counter++;
        moveAround();
        
    }
    
    public void moveAround()
    {
        if(counter < 40)
        {
            setLocation(getX() + speed, getY());
        }
        else
        {
            speed =- speed;
            counter = 0;
        }
    }
}
