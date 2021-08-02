import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Carretera here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Carretera extends World
{

    /**
     * Constructor for objects of class Carretera.
     * 
     */
    public Carretera()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        trafico();
    }
    
    private void trafico()
    {
        Piloto Piloto = new Piloto();
        addObject(Piloto,300, 350);
    }
    
    public void act(){
        if(Greenfoot.getRandomNumber(200)<1){
        addObject(new Carro1(), Greenfoot.getRandomNumber(550),50);
        }
    
        if(Greenfoot.getRandomNumber(200)<1){
        addObject(new Carro2(), Greenfoot.getRandomNumber(450),50);
        }
    
        if(Greenfoot.getRandomNumber(200)<1){
        addObject(new Ambulancia(), Greenfoot.getRandomNumber(600),50);
        }
        
        if(Greenfoot.getRandomNumber(200)<1){
        addObject(new Ambulancia(), Greenfoot.getRandomNumber(450),50);
        }
    
        if(Greenfoot.getRandomNumber(500)<1){
        addObject(new Moneda(), Greenfoot.getRandomNumber(200),50);
        Greenfoot.playSound("moneda.wav");
        }
        
        if(Greenfoot.getRandomNumber(500)<1){
        addObject(new Moneda(), Greenfoot.getRandomNumber(350),50);
        Greenfoot.playSound("moneda.wav");
        }
        
        if(Greenfoot.getRandomNumber(500)<1){
        addObject(new Moneda(), Greenfoot.getRandomNumber(500),50);
        Greenfoot.playSound("moneda.wav");
        }
        
        if(Greenfoot.getRandomNumber(500)<1){
        addObject(new Moneda(), Greenfoot.getRandomNumber(650),50);
        Greenfoot.playSound("moneda.wav");
        }
    }
}
