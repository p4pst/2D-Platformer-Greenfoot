;import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Enemy2 extends Actor
{
    int speed = -1;
    int counter = 0;
    int frame = 1;
    int frame2 = 1;
    int frame3 = 0;
    int shootFrame = 24;
    public static int enemyHealth = 2;
    int animateCounter = 0;
    int animateCounter2 = 0;
    Character character;
    Enemy enemy;
    public void act() 
    {
       moveAround();
       animateCounter++;
       Actor dq = (Actor)getWorld().getObjects(Character.class).get(0);
       
       
       if(shootFrame % 24 == 0)
       {
   

       if(frame == 7)
       {
        BulletOfEnemy bullet2 = new  BulletOfEnemy(); 
        getWorld().addObject(bullet2, getX(), getY()); 
        bullet2.turnTowards(dq.getX(), dq.getY());
        frame3 = 1;
       }
       frame3++;
       } 
       shootFrame++;
       
       if(animateCounter % 6 == 0)
       {
       if(frame == 1)
       {
           setImage("Enemy01/fly01.png");
       }
       else if(frame == 2)
       {
           setImage("Enemy01/fly02.png");
       }
       else if(frame == 3)
       {
           setImage("Enemy01/fly03.png");
       }
       else if(frame == 4)
       {
           setImage("Enemy01/fly04.png");
       }
       else if(frame == 5)
       {
           setImage("Enemy01/fly05.png");
       }
       else if(frame == 6)
       {
           setImage("Enemy01/fly06.png");
       }
       else if(frame == 7)
       {
           setImage("Enemy01/fly07.png");
           frame = 1;
       }
       frame++;
       } 
       animateCounter2++;
       if(animateCounter2 % 6 == 0)
       {
       if(isTouching(Bullet.class))
       {
       animateCounter2++;
       if(frame2 == 1)
       {
           setImage("Enemy01/hit01.png");
       }
       else if(frame2 == 2)
       {
           setImage("Enemy01/hit02.png");
       }
       else if(frame2 == 3)
       {
           setImage("Enemy01/hit03.png");
           frame2 = 1;
       }
       frame2++;
       enemyHealth--;
       }
       
       if(enemyHealth == 0)
       {
          getWorld().removeObject(this);
       }
    }

    }
    public void moveAround()
    {
        counter++;
        if(counter < 40)
        {
            setLocation(getX() + speed, getY());
        }
        else{
            speed =- speed;
            counter = 0;
        }

    }
}
