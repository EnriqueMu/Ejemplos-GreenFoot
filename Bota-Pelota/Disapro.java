import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Disapro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Disapro extends Actor
{
    
    public void act() 
    {
       this.setLocation(this.getX(),this.getY()-10);
       if(this.getY() == 0)
       {
           World mundo = this.getWorld();
           mundo.removeObject(this);
        }
      else if(this.isTouching(Pelota.class))
      {
          this.removeTouching(Pelota.class);
        }
    }    
}
