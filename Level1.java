import greenfoot.*;

public class Level1 extends World
{
    //private Clouds img1, img2;
    //private NormalGrassBlock img3, img4;
    public static int bullets = 15;
    public static boolean noMoreBullets = false;
    public static int carrots = 0;
    public Level1()
    {    
        super(1032, 624, 1, false);
        prepare();
        
        /*img1 = new Clouds();
        addObject(img1, getWidth()/2, getHeight()/2);
        
        img2 = new Clouds();
        addObject(img2, getWidth() + getWidth()/2, getHeight()/2);
        
        img3 = new NormalGrassBlock();
        addObject(img3, getWidth()/2, getHeight()/2);
        
        img4 = new NormalGrassBlock();
        addObject(img4, getWidth() + getWidth()/2, getHeight()/2); */
        
        Character.jumpStrength = 20;
    }

    public void act()
    {
        setBackground("sprites/bg.png");
        if(bullets > 0)
        {
            getBackground().drawImage(new GreenfootImage("Ammo: " + bullets, 30, null, null), 520, 520);
        }
        else{
           getBackground().drawImage(new GreenfootImage("No more Ammo left!", 30, null, null), 520, 520); 
           noMoreBullets = true;
        }
        
        getBackground().drawImage(new GreenfootImage("" + carrots, 30, null, null), 20, 20);
        
        /*if(Greenfoot.isKeyDown("d"))
        {
            img1.scroll();
            img2.scroll();
            
            img3.scroll();
            img4.scroll();
            
        } */
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
        water water = new water();
        addObject(water,99,594);
        water water2 = new water();
        addObject(water2,493,602);
        water water3 = new water();
        addObject(water3,875,603);
        water3.setLocation(875,596);
        water.setLocation(99,600);
        water2.setLocation(492,603);
        water2.setLocation(487,597);
        water3.setLocation(874,597);
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
        removeObject(water);
        removeObject(water2);
        removeObject(water3);
        removeObject(clouds3);
        water water4 = new water();
        addObject(water4,62,599);
        water water5 = new water();
        addObject(water5,449,596);
        water water6 = new water();
        addObject(water6,831,588);
        water6.setLocation(828,598);
        water5.setLocation(461,600);
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
        water5.setLocation(463,599);
        water5.setLocation(474,599);
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
    }
}
