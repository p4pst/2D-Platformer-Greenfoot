import greenfoot.*;

public class Tutorial extends World
{
    public Tutorial()
    {    
        super(1032, 624, 1, false); 
        setBackground("level1/bg.png");
        prepare();
    }

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
        NormalGrassBlock normalGrassBlock4 = new NormalGrassBlock();
        addObject(normalGrassBlock4,396,428);
        normalGrassBlock4.setLocation(381,426);
        NormalGrassBlock normalGrassBlock5 = new NormalGrassBlock();
        addObject(normalGrassBlock5,478,424);
        normalGrassBlock5.setLocation(472,424);
        NormalGrassBlock normalGrassBlock6 = new NormalGrassBlock();
        addObject(normalGrassBlock6,594,415);
        normalGrassBlock6.setLocation(556,420);
        normalGrassBlock6.setLocation(558,426);
        GoBackToMenu goBackToMenu = new GoBackToMenu();
        addObject(goBackToMenu,868,581);
        goBackToMenu.setLocation(942,583);
    }
    
    public void act()
    {
        getBackground().drawImage(new GreenfootImage("Press A or D to move", 30, null, null), 520, 520);
        getBackground().drawImage(new GreenfootImage("Press space to jump", 30, null, null), 540, 80);
        getBackground().drawImage(new GreenfootImage("Press left mouse button to shoot", 30, null, null), 80, 70);
    } 
}
