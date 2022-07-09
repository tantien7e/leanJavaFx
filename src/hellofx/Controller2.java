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

public class Controller2{

    
    @FXML 
    ListView<String> listView2; 
    private Stage stage;
    private Scene scene;
    private Parent root;
    
    public Controller2(){}
    
    public void switchToScene2(){

            Initializer initializer = new Initializer();
            for(Museum x:initializer.museumArr){
                 listView2.getItems().add(x.name);
            }

            listView2.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {

                @Override
                public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
                    // TODO Auto-generated method stub
                    System.out.println("Selected Item: "+ arg2);
                }
            });

            
    }
    public void loadInfor(ActionEvent event){
        
        
    }
    public void selectInfor(ActionEvent event){
        
    }
    
    
}
