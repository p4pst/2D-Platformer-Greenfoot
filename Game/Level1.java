import greenfoot.*;

public class Level1 extends World
{
    public static int bullets = 5;
    public static boolean noMoreBullets = false;
    public static int carrots = 0;
    public Level1()
    {    
        super(1032, 624, 1, false);
        carrots = 0;
        Bullet.speed = 9;
        Enemy.enemyHealth = 1;
        bullets = 5;
        noMoreBullets = false;
        Star.win = false;
        Character.attraction = 9;
        prepare();
        Character.jumpStrength = 20;
    }

    public void act()
    {
        setBackground("level1/bg.png");
        if(bullets > 0)
        {
            getBackground().drawImage(new GreenfootImage("Ammo: " + bullets, 30, null, null), 520, 520);
        }
        else
        {
           getBackground().drawImage(new GreenfootImage("No more Ammo left!", 30, null, null), 520, 520); 
           noMoreBullets = true;
        }
        if(Star.win == true)
        {
            getBackground().drawImage(new GreenfootImage("You Win", 80, null, null), 150, 150);
            Greenfoot.delay(60);
            Greenfoot.setWorld(new Level2());
        }
        getBackground().drawImage(new GreenfootImage("" + carrots, 30, null, null), 20, 20);
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
        normalGrassBlock2.setLocation(179,410);
        NormalGrassBlock normalGrassBlock3 = new NormalGrassBlock();
        addObject(normalGrassBlock3,272,397);
        normalGrassBlock3.setLocation(285,380);
        removeObject(normalGrassBlock3);
        removeObject(normalGrassBlock);
        removeObject(normalGrassBlock2);
        removeObject(clouds);
        removeObject(clouds2);
        removeObject(character);
        removeObject(clouds3);
        NormalGrassBlock normalGrassBlock4 = new NormalGrassBlock();
        addObject(normalGrassBlock4,66,456);
        NormalGrassBlock normalGrassBlock5 = new NormalGrassBlock();
        addObject(normalGrassBlock5,352,399);
        Character character2 = new Character();
        addObject(character2,61,384);
        character2.setLocation(65,389);
        normalGrassBlock5.setLocation(267,428);
        NormalGrassBlock normalGrassBlock6 = new NormalGrassBlock();
        addObject(normalGrassBlock6,499,441);
        normalGrassBlock5.setLocation(245,431);
        normalGrassBlock6.setLocation(431,441);
        Clouds clouds4 = new Clouds();
        addObject(clouds4,176,86);
        Clouds clouds5 = new Clouds();
        addObject(clouds5,637,235);
        Clouds clouds6 = new Clouds();
        addObject(clouds6,871,85);
        clouds5.setLocation(420,197);
        normalGrassBlock5.setLocation(238,431);
        normalGrassBlock5.setLocation(232,426);
        normalGrassBlock5.setLocation(223,427);
        normalGrassBlock6.setLocation(395,443);
        Enemy enemy = new Enemy();
        addObject(enemy,207,397);
        enemy.setLocation(225,403);
        enemy.setLocation(230,401);
        enemy.setLocation(254,398);
        removeObject(enemy);
        Enemy enemy2 = new Enemy();
        addObject(enemy2,228,397);
        enemy2.setLocation(225,399);
        enemy2.setLocation(231,388);
        removeObject(enemy2);
        normalGrassBlock6.setLocation(377,439);
        normalGrassBlock5.setLocation(229,425);
        normalGrassBlock5.setLocation(213,430);
        normalGrassBlock6.setLocation(359,446);
        MovingBlock movingBlock = new MovingBlock();
        addObject(movingBlock,481,441);
        movingBlock.setLocation(513,443);
        movingBlock.setLocation(575,444);
        clouds5.setLocation(498,89);
        Enemy enemy3 = new Enemy();
        addObject(enemy3,210,396);
        enemy3.setLocation(214,395);
        enemy3.setLocation(234,393);
        enemy3.setLocation(241,391);
        enemy3.setLocation(249,380);
        enemy3.setLocation(279,376);
        enemy3.setLocation(283,380);
        enemy3.setLocation(258,380);
        enemy3.setLocation(233,377);
        Carrot carrot = new Carrot();
        addObject(carrot,144,374);
        Carrot carrot2 = new Carrot();
        addObject(carrot2,315,391);
        movingBlock.setLocation(549,443);
        Carrot carrot3 = new Carrot();
        addObject(carrot3,898,554);
        carrot3.setLocation(868,550);
        carrot3.setLocation(850,20);
        carrot3.setLocation(860,239);
        carrot3.setLocation(86,51);
        carrot3.setLocation(55,28);
        carrot3.setLocation(57,37);
        carrot.setLocation(63,360);
        enemy3.setLocation(237,379);
        carrot2.setLocation(360,394);
        Bridge bridge = new Bridge();
        addObject(bridge,662,447);
        bridge.setLocation(681,446);
        bridge.setLocation(735,442);
        Bridge bridge2 = new Bridge();
        addObject(bridge2,650,444);
        bridge2.setLocation(651,441);
        bridge2.setLocation(658,448);
        bridge.setLocation(730,444);
        bridge.setLocation(727,445);
        bridge.setLocation(725,446);
        bridge.setLocation(726,446);
        bridge.setLocation(727,443);
        bridge.setLocation(728,447);
        bridge.setLocation(727,445);
        bridge.setLocation(724,442);
        bridge.setLocation(725,444);
        bridge.setLocation(725,442);
        bridge.setLocation(729,451);
        bridge.setLocation(729,452);
        TallBlock tallBlock = new TallBlock();
        addObject(tallBlock,823,395);
        tallBlock.setLocation(826,399);
        removeObject(bridge2);
        removeObject(bridge);
        tallBlock.setLocation(702,383);
        tallBlock.setLocation(705,504);
        removeObject(tallBlock);
        TallBlock tallBlock2 = new TallBlock();
        addObject(tallBlock2,693,380);
        tallBlock2.setLocation(703,386);
        Star star = new Star();
        addObject(star,750,324);
        star.setLocation(750,328);
        star.setLocation(747,224);
        GoBackToMenu goBackToMenu = new GoBackToMenu();
        addObject(goBackToMenu,953,578);
        goBackToMenu.setLocation(941,592);

        Clouds clouds7 = new Clouds();
        addObject(clouds7,193,154);
        removeObject(clouds7);
    }
}
