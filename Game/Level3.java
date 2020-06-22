import greenfoot.*;

public class Level3 extends World
{
    public static int bullets = Level1.bullets + 3;
    public void act()
    {
        setBackground("Level3/bg.png");
        Bullet.speed = 5;
        getBackground().drawImage(new GreenfootImage("" + Level1.carrots, 30, Color.WHITE, null), 20, 20);   
        if(bullets > 0)
        {
            getBackground().drawImage(new GreenfootImage("Ammo: " + bullets, 30, Color.WHITE, null, null), 520, 520);
        }
        else
        {
           getBackground().drawImage(new GreenfootImage("No more Ammo left!", 30, Color.WHITE, null, null), 520, 520); 
           Level1.noMoreBullets = true;
        }
        if(Star.win == true)
        {
            getBackground().drawImage(new GreenfootImage("You Win", 80, Color.WHITE, null, null), 150, 150);
            Greenfoot.delay(60);
            Greenfoot.setWorld(new YouWon());
        }
    }
    public Level3()
    {    
        super(1032, 624, 1, false);
        prepare();
        Star.win = false;
        bullets = 8;
        Enemy.enemyHealth  = 2;
        Level1.carrots = 0;
        Level1.noMoreBullets = false;
        Character.jumpStrength = 20;
        Character.attraction = 6;
    }
    
    private void prepare()
    {
        Character character = new Character();
        addObject(character,34,541);
        ground6 ground6 = new ground6();
        addObject(ground6,43,590);
        removeObject(ground6);
        NormalGrassBlock normalGrassBlock = new NormalGrassBlock();
        addObject(normalGrassBlock,38,596);
        ground6 ground62 = new ground6();
        addObject(ground62,169,595);
        ground6 ground63 = new ground6();
        addObject(ground63,302,351);
        ground63.setLocation(285,449);
        ground63.setLocation(261,495);
        ground63.setLocation(266,506);
        Carrot carrot = new Carrot();
        addObject(carrot,47,27);
        VerticalMovement verticalMovement = new VerticalMovement();
        addObject(verticalMovement,424,434);
        MovingBlock movingBlock = new MovingBlock();
        addObject(movingBlock,599,429);
        verticalMovement.setLocation(423,455);
        verticalMovement.setLocation(419,504);
        verticalMovement.setLocation(425,518);
        verticalMovement.setLocation(412,521);
        movingBlock.setLocation(500,436);
        movingBlock.setLocation(561,435);
        movingBlock.setLocation(605,429);
        verticalMovement.setLocation(418,539);
        verticalMovement.setLocation(416,495);
        verticalMovement.setLocation(420,527);
        Carrot carrot2 = new Carrot();
        addObject(carrot2,45,469);
        Carrot carrot3 = new Carrot();
        addObject(carrot3,418,368);
        TallBlock tallBlock = new TallBlock();
        addObject(tallBlock,878,416);
        ground6 ground64 = new ground6();
        addObject(ground64,745,424);
        ground64.setLocation(732,423);
        ground64.setLocation(729,424);
        movingBlock.setLocation(619,425);
        Carrot carrot4 = new Carrot();
        addObject(carrot4,725,391);
        Star star = new Star();
        addObject(star,872,313);
    }
}
