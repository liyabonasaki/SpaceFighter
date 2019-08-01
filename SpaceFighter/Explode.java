import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class sht here.
 * 
 * @author (Liyabona Saki) 
 * @version (version 3)
 */
public class Explode extends Actor
{
    /**
     * Act - do whatever the sht wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage img1;
    int count = 0;
    public Explode()
    {
        img1 = new GreenfootImage("Expl3.png");
        img1.scale(200,200);
        setImage(img1);
    }
    public void act() 
    {
        // Add your action code here.
       // method caller
       
       protector();
    } 
    public void protector()
    {
        if (this.isTouching(Protector.class));
        { 
            removeTouching(Protector.class);
          this.getWorld().removeObject(this);
        }
    }
}
