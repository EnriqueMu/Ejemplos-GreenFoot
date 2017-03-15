import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.LinkedList;
import java.awt.Graphics;
import java.awt.event.MouseEvent;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Escenario extends World
{
    private LinkedList<Pelota> pelotas;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Escenario()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, true); 
        pelotas = new LinkedList<Pelota>();
    }
    @Override
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            System.out.println("Click en el mundo");
            MouseInfo raton = Greenfoot.getMouseInfo();
            System.out.println("Coordenadas x = " + raton.getX() + " , " + raton.getY());
            int x = mouseInfo.getX();
            int y = mouseInfo.getY();
            if(Greenfoot.mouseClicked(getWorld()))
            {
                getWorld().addObject(new Pelota(), x,y);
            }
            //Pelota nuevapelota = new Pelota(posx,posy);
            //pelotas.add(nuevaPelota);
        }
    }
   /* public void NuevaPelota()
    {
        if(Greenfoot.mouseClicked(this))
        {
            MouseInfo clic = Greenfoot.getMouseInfo();
            int mx=mouse.getX(), my=mouse.getY();
            Pelota nuevapelota = new Pelota(mx,my);
            
        }
    }
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        for(Pelota p : peltas)
        {
            p.NuevaPelota();
        }
    }*/
}