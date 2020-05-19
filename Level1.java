import greenfoot.*;

public class Level1 extends World
{
    
    public Level1()
    {    
        super(1032, 624, 1);
        prepare();

        Character.jumpStrength = 16;
    }

    public void act()
    {
        setBackground("sprites/bg.png");

    }
    
    private void prepare()
    {
        NormalGrassBlock normalGrassBlock = new NormalGrassBlock();
        addObject(normalGrassBlock,146,418);
        normalGrassBlock.setLocation(41,437);
        Character character = new Character();
        addObject(character,33,395);
        character.setLocation(37,399);
        NormalGrassBlock normalGrassBlock2 = new NormalGrassBlock();
        addObject(normalGrassBlock2,176,437);
        normalGrassBlock2.setLocation(179,440);
        Clouds clouds = new Clouds();
        addObject(clouds,125,131);
        Clouds clouds2 = new Clouds();
        addObject(clouds2,474,185);
        Clouds clouds3 = new Clouds();
        addObject(clouds3,751,73);
        Water water = new Water();
        addObject(water,99,594);
        Water water2 = new Water();
        addObject(water2,493,602);
        Water water3 = new Water();
        addObject(water3,875,603);
        water3.setLocation(875,596);
        water.setLocation(99,600);
        water2.setLocation(492,603);
        water2.setLocation(487,597);
        water3.setLocation(874,597);
    }
}
