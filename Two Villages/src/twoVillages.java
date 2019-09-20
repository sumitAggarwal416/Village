import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

// @author Sumit Aggarwal, 000793607
public class twoVillages extends Application {

    /*
    the actual main method that launches the code
    @param args unused
     */
    public static void main(String[] args) {

        launch(args);
    }

    /*
    @param stage The JavaFX stage to draw on
    @throws Exception
     */
    @Override
    public void start(Stage stage) throws Exception{

        Group root= new Group();
        Scene scene= new Scene(root);
        Canvas canvas = new Canvas(1000,650 ); // set canvas size in pixels
        root.getChildren().add(canvas);
        stage.setScene(scene);
        stage.setTitle("Two Villages");// set window's title
        GraphicsContext gc= canvas.getGraphicsContext2D();

        scene.setFill(Color.SKYBLUE);//color of the canvas

        village one= new village(Color.CORAL); // one is an object village class
        village two= new village(Color.CRIMSON); // two is an object village class
        one.draw(gc); // draw village
        two.draw(gc); // draw village




        stage.show();

    }

}
