import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Carro2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Carro2 extends Tráfico
{
    /**
     * Act - do whatever the Carro2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int speed = 3;
    
    public void act()
    {
        setLocation(getX(), getY() + speed);
        if (getY() >= getWorld().getHeight() -1){
            Carretera juego = (Carretera) getWorld();
            juego.removeObject(this);
        }
    }
}
