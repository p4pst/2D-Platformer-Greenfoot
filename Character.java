import greenfoot.*;

public class Character extends Actor
{  
    GifImage idle = new GifImage("character/idle.gif");
    GifImage run_right = new GifImage("character/run.gif");
    GifImage air = new GifImage("character/air.gif");
    
    private int vSpeed = 5;
    private int acceleration = 1;
    public static int jumpStrength = 12;
    private boolean jumping;
    
    public void act() 
    {
        setImage(idle.getCurrentImage());
        checkFall();
        checkRightWalls();
        checkLeftWalls();
        platformAbove();
        if(Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("d"))
        {
           setLocation(getX() + 2, getY());
           setImage(run_right.getCurrentImage());
        }
        if(Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("a"))
        {
           setLocation(getX() - 2, getY());
           setImage(run_right.getCurrentImage());
        }
        if(Greenfoot.isKeyDown("space"))
        {
            setImage(air.getCurrentImage());
            jump();
        }

    }

    public boolean platformAbove()
    {
        int spriteHeight = getImage().getHeight();
        int yDistance = (int)(spriteHeight/-2);
        Actor ceiling = getOneObjectAtOffset(0, yDistance, blocks.class);
        if (ceiling == null) 
        {
            return false;
        }
        vSpeed = 1;
        bopHead(ceiling);
        return true;
    }
    
    public boolean checkRightWalls()
    {
        int spriteWidth = getImage().getWidth();
        int xDistance = (int)(spriteWidth/2);
        Actor rightWall = getOneObjectAtOffset(xDistance, 0, blocks.class);
        if(rightWall == null)
        {
            return false;
        }
        stopByRightWall(rightWall);
        return true;
    }

    public void stopByRightWall(Actor rightWall)
    {
        int wallWidth = rightWall.getImage().getWidth();
        int newX = rightWall.getX()-(wallWidth + getImage().getWidth())/2;
        setLocation(newX-5, getY());

    }

    public boolean checkLeftWalls()
    {
        int spriteWidth = getImage().getWidth();
        int xDistance = (int)(spriteWidth/-2);
        Actor leftWall = getOneObjectAtOffset(xDistance, 0, blocks.class);
        if(leftWall == null) return false;
        stopByLeftWall(leftWall);
        return true;
    }

    public void stopByLeftWall(Actor leftWall)
    {
        int wallWidth = leftWall.getImage().getWidth();
        int newX = leftWall.getX()+(wallWidth+getImage().getWidth())/2;
        setLocation(newX+5, getY());
    }
    
    public void bopHead(Actor ceiling)
    {
        int ceilingHeight = ceiling.getImage().getHeight();
        int newY = ceiling.getY()+(ceilingHeight+getImage().getHeight())/2;
        setLocation(getX(), newY);
    }

    public void fall()
    {
        setLocation(getX(), getY()+vSpeed);
        if (vSpeed <= 9) vSpeed = vSpeed+acceleration;
        jumping = true;
    }

    public boolean onGround()
    {
        Actor ground = getOneObjectAtOffset(0, getImage().getHeight()/2, blocks.class);
        if(ground == null)
        {
            return false;
        }
        else
        {
            moveToGround(ground);
            return true;
        }
    }
    
    public void moveToGround(Actor ground)
    {
        int groundHeight = ground.getImage().getHeight();
        int newY = ground.getY()-(groundHeight+getImage().getHeight())/2;
        setLocation(getX(), newY);
        jumping = false;
    }
   
    public void jump()
    {
        if(this.onGround() == true)
        {
            vSpeed = vSpeed-jumpStrength;
            fall();
        }
    }
    
    public void checkFall()
    {
        if (onGround()) vSpeed = 0; else fall();
    }  
}


