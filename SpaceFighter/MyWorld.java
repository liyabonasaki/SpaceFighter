import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    int timer = 0;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        prepare();
        
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        
        int pos = 31;     
        addObject(new Aliens(), 850,540);
        addObject(new Aliens(), 850,60);
        addObject(new Protector(), 80, 300);
        getBackground().scale(1000,600);

        for(int i = 0; i < 9; i++)
        {
            addObject(new Asteroid(),650,pos);
            addObject(new Asteroid(),620,pos);
            pos = pos + 64;
        }

        
    }

}
