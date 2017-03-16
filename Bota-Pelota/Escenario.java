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
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Escenario()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, true); 
        prepare();
    }

    @Override
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            System.out.println("Click en el mundo");
            MouseInfo raton = Greenfoot.getMouseInfo();
            System.out.println("Coordenadas x = " + raton.getX() + " , " + raton.getY());
            int x = raton.getX();
            int y = raton.getY();
            addObject(new Pelota(), x,y);
        }
        //Pelota nuevapelota = new Pelota(posx,posy);
        //pelotas.add(nuevaPelota);
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Pelota pelota = new Pelota();
        addObject(pelota,163,137);
        Pelota pelota2 = new Pelota();
        addObject(pelota2,374,116);
        Pelota pelota3 = new Pelota();
        addObject(pelota3,323,174);
        Pelota pelota4 = new Pelota();
        addObject(pelota4,251,76);
        Pelota pelota5 = new Pelota();
        addObject(pelota5,215,186);
        Jugador jugador = new Jugador();
        addObject(jugador,293,359);
        Disapro disapro = new Disapro();
        addObject(disapro,298,325);
        disapro.setLocation(292,308);
    }
}