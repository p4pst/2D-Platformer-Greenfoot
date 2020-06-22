import greenfoot.*;

public class VerticalMovement extends Blocks
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
        if(counter < 55)
        {
            setLocation(getX(), getY() + speed);
        }
        else
        {
            speed =- speed;
            counter = 0;
        }
    }
}
