/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/**
 *
 * @author singk4158
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
     City kw = new City ();
    
     Robot tina=
                new Robot (kw, 1, 1, Direction.EAST);
     
     
     new Thing(kw,1,2);
     new Thing(kw,1,3);
     new Thing(kw,1,4);
     new Thing(kw,1,5);
     new Thing(kw,1,6);
     new Thing(kw,1,7);
     new Thing(kw,1,8);
     new Thing(kw,1,8);
     new Thing(kw,1,9);
     new Thing(kw,1,10);
     
     
    while(tina.frontIsClear())
    {
  tina.move();
  tina.pickThing();
  if(tina.countThingsInBackpack()==7)
  {break;
}
  
}
  tina.move();
  tina.move();
  tina.move();
     
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
}
