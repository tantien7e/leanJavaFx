package controllers;
import vntourism.Lakes;
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

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import vntourism.Lakes;
import vntourism.Museums;
import vntourism.NationalParks;


import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

import hellofx.Initializer;

public class Controller3 {
    private Stage stage;
    private Scene scene;
    private Parent root;
    private String typeOfAttraction;
    private String nameOfAttraction;
    @FXML
    TextArea textArea3;

    public Controller3() {
    }

    public void switchToScene3(String typeOfAttraction, String nameOfAttraction) {
        this.typeOfAttraction = typeOfAttraction;
        this.nameOfAttraction = nameOfAttraction;
        Initializer initializer = new Initializer();
        // textArea3.appendText(initializer.lakeArr.get(0).getName());
        if (this.typeOfAttraction == "Lakes") {
            for (Lakes x : initializer.lakeArr) {
                if (this.nameOfAttraction.equals(x.getName())) {
                    x.display1("TURTLE");
                    String content = "";
                    try {
                        FileReader reader = new FileReader("F:/OOP/JavaFx/leanJavaFx/src/cache/cache.txt");
                        int data;
                        try {
                            data = reader.read();
                            while(data != -1){
                                content += (char)data;
                                data = reader.read();
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                    textArea3.appendText(content);
                }
            }
        }
        if (this.typeOfAttraction == "National_Parks") {
            for (NationalParks x : initializer.nationalParkArr) {
                if (this.nameOfAttraction.equals(x.getName())) {
                    x.display1("TURTLE");
                    Path path = Paths.get("F:/OOP/JavaFx/leanJavaFx/src/cache/cache.txt");
                    try (BufferedReader reader = Files.newBufferedReader(path)) {

                        String str;
                        while ((str = reader.readLine()) != null) {
                            textArea3.appendText(str + "\n");
                        }
            
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }   
    }


    public void displayInTextArea(String lang){
        Initializer initializer = new Initializer();
        if (this.typeOfAttraction == "National_Parks") {
            for (NationalParks x : initializer.nationalParkArr) {
                if (this.nameOfAttraction.equals(x.getName())) {
                    x.display1(lang);
                    Path path = Paths.get("F:/OOP/JavaFx/leanJavaFx/src/cache/cache.txt");
                    try (BufferedReader reader = Files.newBufferedReader(path)) {
                        String str;
                        while ((str = reader.readLine()) != null) {
                            textArea3.appendText(str + "\n");
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        
    }

    public void printToTxt(ActionEvent event) throws IOException {
        String content = textArea3.getText();
        Writer out = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream("data.txt"), "UTF-8"));
        try {
            out.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }

        finally {
            out.close();
        }
    }

    public void printToTtl(ActionEvent event) throws IOException {

    }

}
