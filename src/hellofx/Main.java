package hellofx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import vntourism.Lakes;
import vntourism.TouristAttractions;

import java.io.IOException;
import java.util.ArrayList;

import javafx.*;

public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root;
        try{
            root = FXMLLoader.load(getClass().getResource("../scenebuilder/scene1.fxml"));
            //root.setStyle("-fx-background-image:url('hellofx/cute2.jpg')");
            Scene scene = new Scene(root);
            primaryStage.setTitle("VN Tourism");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch(IOException e){
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        // String path = "F:\\OOP\\JavaFx\\leanJavaFx\\src\\QueriedFiles\\lakes\\Ba_B?_Lake.ttl";
        // String[] s = path.split("\\\\");
        // for(String x:s) System.out.println(x);
      launch(args);
    }

    
}
