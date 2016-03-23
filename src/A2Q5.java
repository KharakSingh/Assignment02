
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author singk4158
 */
public class A2Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        City kw = new City();

        Robot tina =
                new Robot(kw, 0, 2, Direction.SOUTH);
        Robot kharak =
                new Robot(kw, 0, 2, Direction.SOUTH);


        new Wall(kw, 0, 1, Direction.EAST);
        new Wall(kw, 1, 1, Direction.EAST);
        new Wall(kw, 2, 1, Direction.EAST);
        new Wall(kw, 3, 1, Direction.EAST);
        new Wall(kw, 4, 1, Direction.EAST);
        new Wall(kw, 5, 1, Direction.EAST);
        new Wall(kw, 6, 1, Direction.EAST);
        new Wall(kw, 7, 1, Direction.EAST);

        new Wall(kw, 0, 2, Direction.EAST);
        new Wall(kw, 1, 3, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.NORTH);
        new Wall(kw, 1, 5, Direction.NORTH);
        new Wall(kw, 1, 6, Direction.NORTH);
        new Wall(kw, 1, 6, Direction.NORTH);
        new Wall(kw, 1, 6, Direction.EAST);
        new Wall(kw, 2, 6, Direction.EAST);


        new Wall(kw, 2, 3, Direction.SOUTH);
        new Wall(kw, 2, 4, Direction.SOUTH);
        new Wall(kw, 2, 5, Direction.SOUTH);
        new Wall(kw, 2, 6, Direction.SOUTH);

        new Wall(kw, 3, 2, Direction.EAST);

        new Wall(kw, 4, 3, Direction.NORTH);
        new Wall(kw, 4, 4, Direction.NORTH);
        new Wall(kw, 4, 5, Direction.NORTH);
        new Wall(kw, 4, 3, Direction.SOUTH);
        new Wall(kw, 4, 4, Direction.SOUTH);
        new Wall(kw, 4, 5, Direction.SOUTH);
        new Wall(kw, 4, 5, Direction.EAST);
        new Wall(kw, 5, 2, Direction.EAST);
        new Wall(kw, 6, 2, Direction.EAST);


        new Wall(kw, 7, 3, Direction.NORTH);
        new Wall(kw, 7, 4, Direction.NORTH);
        new Wall(kw, 7, 5, Direction.NORTH);
        new Wall(kw, 7, 6, Direction.NORTH);
        new Wall(kw, 7, 7, Direction.NORTH);
        new Wall(kw, 7, 7, Direction.EAST);
        new Wall(kw, 8, 7, Direction.EAST);



        new Wall(kw, 8, 3, Direction.SOUTH);
        new Wall(kw, 8, 4, Direction.SOUTH);
        new Wall(kw, 8, 5, Direction.SOUTH);
        new Wall(kw, 8, 6, Direction.SOUTH);
        new Wall(kw, 8, 7, Direction.SOUTH);
        new Wall(kw, 8, 1, Direction.EAST);
        new Wall(kw, 9, 1, Direction.EAST);
        new Wall(kw, 9, 2, Direction.SOUTH);
        new Wall(kw, 9, 2, Direction.EAST);



        new Thing(kw, 1, 2);
        new Thing(kw, 2, 2);
        new Thing(kw, 1, 3);
        new Thing(kw, 1, 4);
        new Thing(kw, 1, 5);
        new Thing(kw, 2, 4);
        new Thing(kw, 2, 6);
        new Thing(kw, 4, 2);
        new Thing(kw, 4, 3);
        new Thing(kw, 4, 4);
        new Thing(kw, 7, 2);
        new Thing(kw, 7, 3);
        new Thing(kw, 7, 7);
        new Thing(kw, 8, 3);
        new Thing(kw, 8, 4);
        new Thing(kw, 8, 6);


        while (tina.frontIsClear()) {
            // move to next street
            tina.move();
            //turnleft to check driveway
            tina.turnLeft();


            //if front is clear, move and pick thing if he can 
            while (tina.frontIsClear()) {
                tina.move();
                if (tina.canPickThing()) {
                   tina.pickThing();
                
                }
            }
        
        //turnaround
        if (!tina.frontIsClear()) {
            tina.turnLeft();
            tina.turnLeft();
        }

        //come back to side walk
        while (tina.frontIsClear()) {
            tina.move();
        }
    

    //turn south and put snow down 
            tina.turnLeft();
    while (tina.countThingsInBackpack() > 0){
           tina.putThing();
           }
        }
        
    //second robot move if he can pick thing up, pick it up 
      while (kharak.frontIsClear()) {
          kharak.move();
      while(kharak.canPickThing()) {
          kharak.pickThing();
    
          }
      }
    
    
    
    
    
    
    }
}

