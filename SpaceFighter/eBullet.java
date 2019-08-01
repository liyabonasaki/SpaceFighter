 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullets here.
 * 
 * @author (Liyabona Saki) 
 * @version (version 3)
 */
public class eBullet extends Actor

{
    /**
     * Act - do whatever the Bullets wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public eBullet()
    {
        /*move 5 units to left
         * if it touches protector explode object is added to the exact location
         * sound is played 
         * protector is removed from the world
         * the game stops 
         * "game over"
         * if it touches the edge remove from the world 
         * 
         */
        
        
        
    }
    public void act() 
    {
        // Add your action code here.
        //Calling our methods
   
        move();
        killprotector();
    
    }
    public void move()
        {
            move(-5);
           

        }
        

    public void killprotector()
      {
          if(isTouching(Protector.class))
        {
             removeTouching(Protector.class);
             getWorld().addObject(new Explode(), getX(), getY());
             Greenfoot.stop();
             
            
             
               // Greenfoot.delay(1);
          
               Greenfoot.playSound("explode3.wav");
              World w = getWorld();
               w.showText("Game Over ", 500,300);
         
        }
    
        
            if (isAtEdge())
            {
                World w = getWorld();
                w.removeObject(this);
            }
           
    }

}
