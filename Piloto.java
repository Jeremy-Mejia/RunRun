import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Piloto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Piloto extends Actor
{
    /**
     * Act - do whatever the Piloto wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int score = 0;
    private int lives = 5;
    public void act()
    {
        choque();
        fin();
        getWorld().showText("Score:" + score, 70, 30);
        score();
    }
    
    public void choque(){
        if(Greenfoot.isKeyDown("left")){
            if(getX()>= -180){
                setLocation(getX() -3, getY());}
        }
        
        if(Greenfoot.isKeyDown("right")){
            if(getX()<= 600){
                setLocation(getX() +3, getY());}
        }
        
        if(Greenfoot.isKeyDown("down")){
            {setLocation(getX(), getY()+3);}
        }
        
        if(Greenfoot.isKeyDown("up")){
            {setLocation(getX(), getY()-3);}
        }
    }
    
    public void fin(){
        if(isTouching(Carro1.class)||isTouching(Carro2.class)||isTouching(Ambulancia.class)){
            getWorld() .showText("Game Over \n score: " +score, 300, 200);
            Greenfoot.stop();
        }
    } 
    
    public void score(){
        if(isTouching(Moneda.class)){
            score = score + 10;
            removeTouching(Moneda.class);
        }
    }
}












