import java.awt.Color;

public class Turtle
{
    public static void main(String args[])
     throws InterruptedException
    {
        World turtleWorld = new World();
        Turtle turtle1 = new Turtle(turtleWorld);
        Turtle turtle2 = new Turtle(turtleWorld);
        Turtle turtle3 = new Turtle(turtleWorld);
        Turtle turtle4 = new Turtle(turtleWorld);
        int x = 1;
        turtle1.setPenColor(Color.RED);
        turtle2.setPenColor(Color.GREEN); 
        turtle3.setPenColor(Color.YELLOW);
        turtle4.setPenColor(Color.BLUE);
        turtle1.penDown();
        turtle2.penDown();
        turtle3.penDown();
        turtle4.penDown();
        turtle2.turn(-90);
        turtle1.turn(90);
        turtle3.turn(180);
       while(x != 36)
       {turtle1.forward(10);
        turtle1.turn(10);
        turtle2.forward(10);
        turtle2.turn(10);
        turtle3.forward(10);
        turtle3.turn(10);
        turtle4.forward(10);
        turtle4.turn(10);
        Thread.sleep(1000);
        x = x + 1;
        }
        turtle1.forward(50);
        turtle2.forward(50);
        turtle3.forward(50);
        turtle4.forward(50);
        
    }
}
