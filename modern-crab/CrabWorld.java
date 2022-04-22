import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CrabWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CrabWorld extends World
{

    /**
     * Constructor for objects of class CrabWorld.
     * 
     */
    public CrabWorld()
    {    
        super(560, 560, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Crab crab = new Crab();
        addObject(crab,128,318);
        Worm worm = new Worm();
        addObject(worm,40,227);
        Worm worm2 = new Worm();
        addObject(worm2,199,87);
        Worm worm3 = new Worm();
        addObject(worm3,343,262);
        Worm worm4 = new Worm();
        addObject(worm4,470,120);
        Worm worm5 = new Worm();
        addObject(worm5,428,76);
        Worm worm6 = new Worm();
        addObject(worm6,449,315);
        Worm worm7 = new Worm();
        addObject(worm7,493,415);
        Worm worm8 = new Worm();
        addObject(worm8,300,437);
        Worm worm9 = new Worm();
        addObject(worm9,482,515);
        Worm worm10 = new Worm();
        addObject(worm10,105,401);
        Worm worm11 = new Worm();
        addObject(worm11,179,484);
        Worm worm12 = new Worm();
        addObject(worm12,217,178);
        Worm worm13 = new Worm();
        addObject(worm13,57,55);
    }
}
