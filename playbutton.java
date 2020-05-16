import greenfoot.*;

public class playbutton extends Actor
{
     private Actor actorHoveredOver = null;
     
    
    public playbutton()
    {
        setImage("menu/playButton.png");
    }
    public void act() 
    {
        hoverOwner();
    }  
    
    public void hoverOwner() {
        
         if ((actorHoveredOver == null || actorHoveredOver.getWorld() == null)
                && Greenfoot.mouseMoved(this)) {
            actorHoveredOver = this;
        } else if (actorHoveredOver == this && Greenfoot.mouseMoved(null)
                && !Greenfoot.mouseMoved(this)) {
            actorHoveredOver = null;
        }
        
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new World1());
        }
    }
}
