package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.xml.soap.Text;
import java.awt.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("HOME.fxml"));
        primaryStage.setTitle("UH GYM JAVA FINAL - JavaFX");
        primaryStage.setScene(new Scene(root, 785, 570));
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }


    //Use [6] String arguments to make a new client.
    //public person(String id, String first, String last, String address, String number, String Trainer)
    person client = new person("1","Benjamin","Salazar","10727 Sagebluff Dr.","281-940-4678","Bucky" );
    person client2 = new person("2","Kevin","Sanchez","10727 Sagebluff Dr.","281-940-4678","Bucky" );
    person client3 = new person("3","Howard","Cole","10727 Sagebluff Dr.","281-940-4678","Bucky" );







    String firstArray[][]={{ client.toString() ,"2","3","4"},{"5","6","7","8"}};
    String secondArray[][]={{"1","2","3","4"},{"5","6","7","8"}};


    //Printing out a multidimensional array
    /*
    public static void display(int x[][]){
        for(int row=0;row<x.length;row++){
            for(int column=0;column<x[row].length;column++) {
                System.out.print(x[row][column]+"\t");
            }
            System.out.println();
        }
    }
    */

    //How to print out a person Object
        /*
        System.out.println(client.toString());
        System.out.println(trainer.toStringT());
        */

}
