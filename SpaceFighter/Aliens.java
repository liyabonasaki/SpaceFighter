 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Target here.
 * 
 * @author (Liyabona Saki) 
 * @version (version 3)
 */
public class Aliens extends Actor
{
    /**
     * Act - do whatever the Target wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int counter = 100;
    int direction = 1;
    int speed = 5;
    int hits = 0;
    int topY = 100;
    int lowerY = 500;
    int score = 0;
    int reloadTime = 100;
    
    private int delayCount = 5;
    
    GreenfootImage img1;
   
    
    
    public Aliens()
    {
        img1 = new GreenfootImage("Ship.png");
        setImage(img1);
        setRotation(90);
    }
    public void act() 
    {
        // Add your action code here.
        //method caller
        
        shooting();
        mover();
        hits();
     
    }    
    
    public void shooting()
        {
          
           if (reloadTime == 0)
           {
            
            getWorld().addObject(new eBullet(), getX() ,getY());
            reloadTime = 100;
           }
           reloadTime--;
           

        
    }
      
 
        
 public void hits()
        {
            World w = getWorld();
            if(isTouching(pBullet.class))
            {
              removeTouching(pBullet.class);
              hits++;
              Greenfoot.playSound("hit1.wav");
            }
            if (hits == 5)
            {
                
                getWorld().addObject(new Explode(), getX(), getY());
                w.removeObject(this);
            }
            
            
            
            
        }
         
public void mover()
    {
   
    setLocation(getX(), getY() + (direction * speed));
      if (getY() < topY)
      {
          direction = 1;
      }
      if (getY() > lowerY)
      {
          direction = - 1;
      }
    
   } 
  

}

