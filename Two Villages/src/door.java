import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/*
class draws door in the house
@author Sumit Aggarwal, 000793607
 */
public class door {

    private double x;
    private double y;
    private double height;

    /*
    constructor door with parameters
    @param x is the x-coordinate of the door
    @param y is the y-coordinate of the door
    @param height is the height of the door
     */
    public door(double x, double y, double height){

        this.x=x;
        this.y=y;
        this.height=height;

    }

    /*
    draws door with graphic context
    @param gc is the GraphicsContext object
     */
    public void draw(GraphicsContext gc){

        gc.setFill(Color.WHITE);
        gc.fillRect(x,y,height,2*height);

    }

}
