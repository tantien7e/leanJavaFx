package hellofx;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import java.io.IOException;
import java.net.URL;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

public class Controller{
    
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private ListView<String> myListView;
    @FXML
    private Label myLabel;
    @FXML
    private Button selectButton;


    public void switchToScene1(ActionEvent event){
        try {
            root = FXMLLoader.load(getClass().getResource("scene1.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void switchToScene2(ActionEvent event){
   
        FXMLLoader loader = new FXMLLoader(getClass().getResource("scene2.fxml"));
        try {
            root = loader.load();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        Controller2 controller2 = loader.getController();
        controller2.switchToScene2(currentAttraction);
        scene = new Scene(root);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }


    public void switchToScene3(ActionEvent event){
        try {
            root = FXMLLoader.load(getClass().getResource("scene3.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void switchToScene4(ActionEvent event){
        try {
            root = FXMLLoader.load(getClass().getResource("scene4.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    


    String[] attractions = {"Museum", "Park", "Lake"};
    String currentAttraction;

    public void loadInfor(ActionEvent event){
        myListView.getItems().addAll(attractions);
        myListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {

            @Override
            public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
                // TODO Auto-generated method stub
                System.out.println("Selected Item: "+ arg2);
                currentAttraction = arg2;
                System.out.println(currentAttraction);
            }
        });
    }
    
}



