import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bomb here.
 * 
 * @author (Liyabona Saki) 
 * @version (version 3)
 */
public class pBullet extends Actor
{
    /**
     * Act - do whatever the Bomb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int score = 0;
    
    public void act() 
    {
        // Add your action code here.
       touch();
       move();
    }
    public void move()
        {
            move(5);
        }
    public void touch()
        {
    //1. touches Asteroid then remove it
    //Declaration of the world
     
    if (isTouching(Asteroid.class))
        {
            removeTouching(Asteroid.class);
            this.getWorld().removeObject(this);
        }
    else
    
    if (isTouching(Aliens.class))
        {
         removeTouching(Aliens.class);   
            this.getWorld().removeObject(this);
            Greenfoot.playSound("hit1.wav");
        }
        else
        if(isTouching(eBullet.class))
        {
            removeTouching(eBullet.class);
            this.getWorld().removeObject(this);
        }
   
    }
    
    public void beingKilled()

    {
        {
             Greenfoot.playSound("explode3.wav");
           
           // Greenfoot.playSound("game-over.wav");
           if (isAtEdge())
            {
                World w = getWorld();
                w.removeObject(this);
                this.getWorld().removeObject(this);
            }
         
        }
        
        

    }
 
}
