import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/*
This class makes  windows for the house
@author Sumit Aggarwal, 000793607
 */

public class window {
    // x and y are the coordinates of the window
    private double x;
    private double y;
    private double diameter;

    /*
    constructor window with parameters
    @param x is the x-coordinate
    @param y is the y-coordinate
    @diameter is the diameter of the circle
     */
    public window(double x, double y, double diameter){

        this.x=x;
        this.y=y;
        this.diameter=diameter;

    }

    /*
    draws window with 2d graphic context
    @param gc is the GraphicsContext object
     */
    public void draw(GraphicsContext gc){

        gc.setFill(Color.WHITE);
        gc.fillOval(x,y,diameter,diameter);

    }

}
