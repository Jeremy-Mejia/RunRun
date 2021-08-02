import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ambulancia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ambulancia extends Tráfico{

    /**
     * Act - do whatever the Ambulancia wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int speed = 4;
    
    public void act()
    {
        setLocation(getX(), getY() + speed);
        if (getY() >= getWorld().getHeight() -1){
            Carretera juego = (Carretera) getWorld();
            juego.removeObject(this);
        }
    }
}
