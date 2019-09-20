import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/*
house class is associated with door and window classes
@author Sumit Aggarwal, 000793607
 */
public class house {

    private double x;
    private double y;
    private double size;
    private int occupants= (int) (Math.random()*1000);
    private Color color;
    private door door;
    private window window;

    /*
    constructor house with parameters
    @param x is the x-coordinate of the house
    @param y is the y-coordinate of the house
    @param size is the size of the house
    @param color is the color of the house
     */
    public house(double x, double y, double size, Color color){

        this.x=x;
        this.y=y;
        this.size=size;
        this.color=color;
        setOccupants(occupants);
        window= new window(x+(size*0.1),y+(size*0.15),25);
        door= new door(x+(size*0.5),y+(size*0.47),size*0.27);

    }

    /*
     @param x is the x-coordinate of the house
    @param y is the y-coordinate of the house
     */
    public house(double x, double y){

        this.x=x;
        this.y=y;

    }

    /*
    draws draw door and window in the house
    @param gc is the GraphicsContext object
     */
    public void draw(GraphicsContext gc){

        gc.setFill(color);
        gc.fillRect(x,y,size,size);
        door.draw(gc);
        window.draw(gc);

    }

    //@return the occupants in the house
    public int getOccupants(){

        return occupants;

    }

    // @param occupants has the number of occupants in the house
    public void setOccupants(int occupants) {
        this.occupants = occupants;
    }

    // @return the size of the house
    public double getSizs(){

        return size;

    }

}
