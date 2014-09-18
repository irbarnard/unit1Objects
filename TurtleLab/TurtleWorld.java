import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
    {
        World turtleWorld = new World();
        Turtle turtle1 = new Turtle(turtleWorld);
        turtle1.setPenColor(Color.YELLOW);
        turtle1.penDown();
        turtle1.turn(270);
        turtle1.forward(50);
        Turtle turtle2 = new Turtle(turtleWorld);
        turtle2.setPenColor(Color.YELLOW);
        turtle2.penDown();
        turtle2.turn(90);
        turtle2.forward(50);
        turtle1.turn(135);
        turtle2.turn(225);
        turtle1.forward(74);
        turtle2.forward(74);
        turtle1.turn(180);
        turtle2.turn(180);
        turtle1.forward(37);
        turtle2.forward(37);
        turtle1.turn(270);
        turtle2.turn(135);
        turtle1.forward(37);
        turtle2.forward(50);
        turtle1.turn(-90);
        turtle1.forward(34);
        turtle1.turn(45);
        turtle1.penUp();
        turtle2.penUp();
        turtle1.forward(50);
        turtle2.forward(50);
        
        
    }
}
