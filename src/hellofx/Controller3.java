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
import javafx.scene.control.TextArea;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;
public class Controller3 {
    private Stage stage;
    private Scene scene;
    private Parent root;
    private String typeOfAttraction;
    private String nameOfAttraction;
    @FXML 
    TextArea textArea3;
    

    public Controller3(){}

    public void switchToScene3(String typeOfAttraction, String nameOfAttraction){
        this.typeOfAttraction = typeOfAttraction;
        this.nameOfAttraction = nameOfAttraction;
        Initializer initializer = new Initializer();
        //textArea3.appendText(initializer.lakeArr.get(0).getName());
        if(typeOfAttraction == "Lake"){
            for(Lakes x:initializer.lakeArr){
                if(x.name == nameOfAttraction){
                    textArea3.appendText(x.getName()+"\n");
                    textArea3.appendText(x.getAbstrc()+"\n");
                    textArea3.appendText(Integer.toString(x.getYear()));
                }
            }
        }
        if(typeOfAttraction == "Park"){
            for(Parks x:initializer.parkArr){
                if(x.name == nameOfAttraction){
                    textArea3.appendText(x.getName()+ "\n");
                    textArea3.appendText(x.getAbstrc()+ "\n");
                    textArea3.appendText(Integer.toString(x.getYear()));
                }
            }
        }
        if(typeOfAttraction == "Museum"){
            for(Museum x:initializer.museumArr){
                if(x.name == nameOfAttraction){
                    textArea3.appendText(x.getName()+ "\n");
                    textArea3.appendText(x.getAbstrc()+"\n");
                    textArea3.appendText(Integer.toString(x.getYear()));
                }
            }
        }
    }

    public void printToTxt(ActionEvent event) throws IOException{
        String content = textArea3.getText();
        Writer out = new BufferedWriter(new OutputStreamWriter(
            new FileOutputStream("data.txt"), "UTF-8"));
        try {
            out.write(content);
        } catch (IOException e){
            e.printStackTrace();
        } 
        
        finally {
            out.close();
        }
    }
    public void printToTtl(ActionEvent event) throws IOException{

    }



}
