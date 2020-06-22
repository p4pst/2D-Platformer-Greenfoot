import greenfoot.*;

public class Level2 extends World
{
    public static int bullets = Level1.bullets + 3;
    public void act()
    {
        setBackground("Level2/bg.png");
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
            getBackground().drawImage(new GreenfootImage("You Win", 80,Color.WHITE, null, null), 150, 150);
            Greenfoot.delay(60);
            Greenfoot.setWorld(new Level2());
        }
    }
    public Level2()
    {    
        super(1032, 624, 1, false); 
        Star.win = false;
        bullets = 8;
        Enemy.enemyHealth  = 2;
        Level1.carrots = 0;
        Level1.noMoreBullets = false;
        Character.jumpStrength = 20;
        Character.attraction = 4;
        Enemy2.enemyHealth = 5;
        prepare();
    }
   
    private void prepare()
    {
        TallBlock tallBlock = new TallBlock();
        addObject(tallBlock,134,457);
        tallBlock.setLocation(130,460);
        Character character = new Character();
        addObject(character,132,352);
        Carrot carrot = new Carrot();
        addObject(carrot,58,28);
        carrot.setLocation(52,36);
        Enemy2 enemy2 = new Enemy2();
        addObject(enemy2,336,386);
        GoBackToMenu goBackToMenu = new GoBackToMenu();
        addObject(goBackToMenu,825,596);
        goBackToMenu.setLocation(917,577);
        enemy2.setLocation(368,317);
        TallBlock tallBlock2 = new TallBlock();
        addObject(tallBlock2,429,476);
        tallBlock2.setLocation(321,437);
        removeObject(tallBlock2);
        NormalGrassBlock normalGrassBlock = new NormalGrassBlock();
        addObject(normalGrassBlock,368,438);
        normalGrassBlock.setLocation(367,443);
        MovingBlock movingBlock = new MovingBlock();
        addObject(movingBlock,577,441);
        Carrot carrot2 = new Carrot();
        addObject(carrot2,150,350);
        carrot2.setLocation(151,352);
        Carrot carrot3 = new Carrot();
        addObject(carrot3,392,313);
        carrot3.setLocation(387,347);
        Carrot carrot4 = new Carrot();
        addObject(carrot4,615,358);
        MovingBlock movingBlock2 = new MovingBlock();
        addObject(movingBlock2,745,438);
        movingBlock2.setLocation(743,438);
        TallBlock tallBlock3 = new TallBlock();
        addObject(tallBlock3,846,369);
        tallBlock3.setLocation(846,376);
        Star star = new Star();
        addObject(star,870,321);
        tallBlock3.setLocation(914,372);
        star.setLocation(921,309);
        star.setLocation(918,250);
        enemy2.setLocation(475,309);
        Enemy enemy = new Enemy();
        addObject(enemy,919,336);
        enemy.setLocation(912,330);
        enemy.setLocation(912,311);
        enemy.setLocation(916,261);
        enemy.setLocation(920,288);
        enemy.setLocation(922,275);
        Enemy enemy3 = new Enemy();
        addObject(enemy3,895,316);
        removeObject(enemy3);
    }
}
