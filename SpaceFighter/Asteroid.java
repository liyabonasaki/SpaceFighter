import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Walls here.
 * 
 * @author (Liyabona Saki) 
 * @version (version 3)
 */
public class Asteroid extends Actor
{
    /**
     * Act - do whatever the Walls wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage rockImg;
    int counter = 0;
    int direction = 1;
    int topY = 100;
    int lowerY = 500;
    int speed = 4;
    
  
    
    public Asteroid()
    {
        rockImg = new GreenfootImage("Rock4.png");
        rockImg.scale(80,80);
        setImage(rockImg);
    }
    
    public void act() 
    {
        // Add your action code here.
        counter++;
         mover();
         if(isAtEdge())
         setLocation(600, getY());
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
