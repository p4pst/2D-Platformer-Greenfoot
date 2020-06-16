import greenfoot.*;

public class Level extends World
{
    GifImage bg = new GifImage("menu/bg.gif");

    public Level()
    {    
        super(1032, 624, 1);
        setBackground(bg.getCurrentImage());
        prepare();
    }


    public void act()
    {
        setBackground(bg.getCurrentImage());
    }

    public void started()
    {
        Menu.sound.play();
        Menu.sound.setVolume(40);
    }

    public void stopped()
    {     
        Menu.sound.stop();
    }

    public void gameOver()
    {
        Menu.sound.stop();
    }
    
    private void prepare()
    {
        Level1Button level1Button = new Level1Button();
        addObject(level1Button,135,92);
        level1Button.setLocation(128,60);
        level1Button.setLocation(119,47);
        GoBackToMenu goBackToMenu = new GoBackToMenu();
        addObject(goBackToMenu,869,531);
        goBackToMenu.setLocation(932,591);
        Level2Button level2Button = new Level2Button();
        addObject(level2Button,275,49);
        level2Button.setLocation(317,46);
        level2Button.setLocation(326,49);
        howToPlay howToPlay = new howToPlay();
        addObject(howToPlay,90,528);
        howToPlay.setLocation(82,583);
        howToPlay howToPlay2 = new howToPlay();
        addObject(howToPlay2,200,585);
        howToPlay2.setLocation(68,598);
        removeObject(howToPlay2);
        howToPlay.setLocation(86,597);
        howToPlay.setLocation(89,596);
        level2Button.setLocation(528,53);
        level1Button.setLocation(388,51);
        howToPlay.setLocation(94,54);
        level1Button.setLocation(324,62);
        howToPlay.setLocation(111,52);
        level1Button.setLocation(325,34);
        level1Button.setLocation(346,58);
        level1Button.setLocation(326,70);
        level1Button.setLocation(261,50);
        level1Button.setLocation(330,60);
        level1Button.setLocation(142,52);
        level2Button.setLocation(328,58);
        level1Button.setLocation(128,197);
        level1Button.setLocation(110,47);
        level2Button.setLocation(278,50);
        level1Button.setLocation(137,57);
        level1Button.setLocation(94,62);
        level1Button.setLocation(492,328);
        level1Button.setLocation(129,176);
        howToPlay.setLocation(548,302);
        level1Button.setLocation(78,50);
        howToPlay.setLocation(483,316);
        level2Button.setLocation(284,60);
        level1Button.setLocation(153,46);
        level2Button.setLocation(352,63);
        level1Button.setLocation(159,47);
        level2Button.setLocation(316,60);
        level1Button.setLocation(154,51);
        level1Button.setLocation(110,66);
        level1Button.setLocation(130,76);
        level1Button.setLocation(126,70);
        level1Button.setLocation(75,51);
        level1Button.setLocation(55,54);
        level1Button.setLocation(58,50);
        level1Button.setLocation(113,57);
        level1Button.setLocation(125,74);
        level1Button.setLocation(86,75);
        level1Button.setLocation(173,61);
        level1Button.setLocation(111,53);
        level1Button.setLocation(111,52);
        level1Button.setLocation(158,58);
        level1Button.setLocation(125,62);
        howToPlay.setLocation(88,583);
        howToPlay.setLocation(125,580);
    }
}
