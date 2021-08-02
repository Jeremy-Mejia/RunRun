import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Moneda here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Moneda extends Tráfico
{
    /**
     * Act - do whatever the Moneda wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int speed = 2;
    
    public void act()
    {
        setLocation(getX(), getY() + speed);
        if (getY() >= getWorld().getHeight() -1){
            Carretera juego = (Carretera) getWorld();
            juego.removeObject(this);
        }
    }
}
