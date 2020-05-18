import greenfoot.*;

public class World1 extends World
{
    public World1()
    {    
        super(1032, 624, 1);
        buildWorld();
    }
    private void buildWorld()
    {
        addObject(new GoBackToMenu(), 60, 605);
    }
}
