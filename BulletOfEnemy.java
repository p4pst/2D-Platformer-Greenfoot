import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BulletOfEnemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BulletOfEnemy extends Actor
{
    int speed = 10;
    public void act() 
    {
       setImage("sprites/blocks/mushroom2.png");
       speed = Bullet.speed;
       move(speed);
    }    
}
