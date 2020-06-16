import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Level2 extends World
{
    public static int bullets = 3;
    public static boolean noMoreBullets = false;
    public static int carrots = 0;
    Character character = new Character();
    public void act()
    {
        setBackground("Level2/bg.png");
    }
    public Level2()
    {    
        super(1032, 624, 1, false); 
        Star.win = false;
        Character.jumpStrength = 20;
        Character.attraction = 2;
        if(bullets > 0)
        {
            getBackground().drawImage(new GreenfootImage("Ammo: " + bullets, 30, null, null), 520, 520);
        }
        else{
            getBackground().drawImage(new GreenfootImage("No more Ammo left!", 30, null, null), 520, 520); 
            noMoreBullets = true;
        }
        if(Star.win == true)
        {
            getBackground().drawImage(new GreenfootImage("You Win", 80, null, null), 150, 150);
        }
        getBackground().drawImage(new GreenfootImage("" + carrots, 30, null, null), 20, 20);
        prepare();
    }
   
    private void prepare()
    {
        TallBlock tallBlock = new TallBlock();
        addObject(tallBlock,134,457);
        tallBlock.setLocation(130,460);
        addObject(character,132,352);
        Carrot carrot = new Carrot();
        addObject(carrot,58,28);
        carrot.setLocation(52,36);
        tallBlock.setLocation(32,605);
        character.setLocation(36,526);
        character.setLocation(27,564);
        removeObject(tallBlock);
        NormalGrassBlock NormalGrassBlock = new NormalGrassBlock();
        addObject(NormalGrassBlock,40,603);
        addObject(tallBlock, 232, 487);
        ground6 ground6 = new ground6();
        addObject(ground6, 520, 438);
        NormalGrassBlock normalGrassBlock2 = new NormalGrassBlock();
        addObject(normalGrassBlock2,587,603);
    }
}
