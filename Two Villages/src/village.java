import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import java.util.*;

/*
village class creates multiple houses
@author Sumit Aggarwal, 000793607
 */
public class village {

    private double x; //x coodinate
    private double y; //y coordinate
    private double size; // size of the house
    private Color color; // color of the house
    private String name; // name of the village
    private int pop; // population of the village
    private house house1, house2, house3; // 3 houses in the village

    // @param color is the color color of the houses
    public village(Color color){

        Scanner input= new Scanner(System.in);

        boolean loop=true; // loop control variable
        System.out.println("Please enter x coordinate: ");
        x= input.nextDouble();
        System.out.println("Please enter y coordinate: ");
        y=input.nextDouble();
        System.out.println("Please enter the size of the biggest house in the village: ");
        size= input.nextDouble();
        double length= x+(size*0.75)+size+2*(size*0.2); // size of the village
        if(x>650||x<0||y>500||y<0||size>210||size<50||length>650){
            while(loop==true){
                System.out.println("Invalid entry");
                System.out.println("Please enter x coordinate such that your village does not go inside the castle area which starts at x=650: ");
                x= input.nextDouble();
                System.out.println("Please enter y coordinate such that your village does not go inside the castle area: ");
                y=input.nextDouble();
                System.out.println("Please enter the size of the biggest house in the village between 50 and 210: ");
                size= input.nextDouble();
                loop=false;

            }
        }
        else{
            System.out.println("Please enter the name of your village: ");
            name= input.next();
        }
        this.name=name;
        this.x=x;
        this.y=y;
        this.color=color;
        this.size=size;

        house1= new house(x,y,size,color); // object house1 of house
        house2= new house(x+size+(size*0.2),y+(size-(size*0.75)),size*0.75,color); // object house2 of house
        house3= new house(x+(size*0.75)+size+2*(size*0.2),y+(size-(size*0.5)),size*0.50,color);// object house3 of house


    }

    /*
    draws the village with graphic context
    @param gc is the object of GraphicsContext
     */
    public void draw(GraphicsContext gc){

        house king= new house(685,185,252,Color.GOLD); // object king of house
        king.draw(gc);

        pop= house1.getOccupants();
        house1.draw(gc);
        house2.draw(gc);
        house3.draw(gc);
        gc.setFill(color);
        gc.fillText(name+" ( size "+size+"m, population "+pop+")",x,y,350);

    }

}
