import greenfoot.*;

public class World1 extends World
{
    public World1()
    {    
        super(1032, 624, 1);
        buildWorld();
        prepare();
    }

    private void buildWorld()
    {
        addObject(new GoBackToMenu(), 60, 605);
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        blocks blocks = new blocks();
        addObject(blocks,111,345);
        blocks.setLocation(50,396);
        Character character = new Character();
        addObject(character,71,345);
        character.setLocation(42,366);
        grass grass = new grass();
        addObject(grass,133,413);
        blocks.setLocation(48,394);
        removeObject(blocks);
        grass.setLocation(25,401);
    }
}
