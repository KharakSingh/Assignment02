/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author singk4158
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
      City kw = new City ();
    
     Robot tina=
                new Robot (kw, 3, 1, Direction.EAST);
    
     new Wall(kw,3,1, Direction.SOUTH);
     new Wall(kw,3,2, Direction.SOUTH);
     new Wall(kw,3,3, Direction.SOUTH);
     new Wall(kw,3,4, Direction.SOUTH);
     new Wall(kw,3,5, Direction.SOUTH);
     new Wall(kw,3,6, Direction.SOUTH);
     new Wall(kw,3,7, Direction.SOUTH);
     new Wall(kw,3,8, Direction.SOUTH);
     new Wall(kw,3,9, Direction.SOUTH);
     new Wall(kw,3,1, Direction.EAST);
     new Wall(kw,3,2, Direction.EAST);
     new Wall(kw,3,4, Direction.EAST);
     new Wall(kw,3,7, Direction.EAST);
     new Thing(kw,3,9);
     
     
     tina.setLabel("T");
     
     while(!tina.canPickThing()){
           
       if(!tina.frontIsClear()){
           tina.turnLeft();
           tina.move();
           tina.turnLeft();
           tina.turnLeft();
           tina.turnLeft();
           tina.move();
           tina.turnLeft();
           tina.turnLeft();
           tina.turnLeft();
           tina.move();
           tina.turnLeft();
        
           
       }else{
        
            tina.move();
        }
           
           
           
       
       
       
       
       
       
         
       
     }
            
       
             
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
}
