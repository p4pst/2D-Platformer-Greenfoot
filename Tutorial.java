import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tutorial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tutorial extends World
{

    /**
     * Constructor for objects of class Tutorial.
     * 
     */
    public Tutorial()
    {    
        super(1032, 624, 1, false); 
        setBackground("level1/bg.png");
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        NormalGrassBlock normalGrassBlock = new NormalGrassBlock();
        addObject(normalGrassBlock,140,428);
        NormalGrassBlock normalGrassBlock2 = new NormalGrassBlock();
        addObject(normalGrassBlock2,297,426);
        NormalGrassBlock normalGrassBlock3 = new NormalGrassBlock();
        addObject(normalGrassBlock3,220,429);
        normalGrassBlock3.setLocation(217,428);
        normalGrassBlock2.setLocation(303,424);
        normalGrassBlock2.setLocation(304,426);
        normalGrassBlock2.setLocation(297,425);
        normalGrassBlock2.setLocation(295,428);
        Character character = new Character();
        addObject(character,150,356);
    }
}
