import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Protector here.
 * 
 * @author (Liyabona Saki) 
 * @version (version 3)
 */
public class Protector extends Actor
{
    /**
     * Act - do whatever the Protector wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int timer = 30;
    int speed = 10;
    GreenfootImage img1;
    
    Protector()
    {
        img1 = new GreenfootImage("blueship.png");
        img1.scale(150,150);
        setImage(img1);
        
    }
    public void act() 
    {
        // Add your action code here.
        
        shoot();
        mover();
        hit(); 
        
         
    }  
     //The Protector will be moving up and down
    public void mover()
    {
    if (Greenfoot.isKeyDown("Down"))
        {
            setLocation(getX(), getY() + 5);
        }
    
    if (Greenfoot.isKeyDown("Up"))
        {
            setLocation(getX(), getY() - 5);
        }  
    }
    public void shoot() 
    {
    //press space to shoot 
    if (Greenfoot.isKeyDown("Space"))
        {
            getWorld().addObject(new pBullet(), getX()+1, getY());
        }
    }
    
    public void hit()
    {
        
        
        
        
    }
    
  
}
