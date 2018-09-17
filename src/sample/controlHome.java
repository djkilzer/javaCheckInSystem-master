package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class controlHome {

    //Select [CLIENT SCREEN] button with on action event [selectedCLIENT]
    public void selectedCLIENT(ActionEvent event)throws IOException {

        Parent homeViewParent = FXMLLoader.load(getClass().getResource("CLIENT.fxml"));
        Scene homeViewScene = new Scene(homeViewParent);

        //this line gets the information
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(homeViewScene);
        window.show();
    }

    //Select [TRAINER SCREEN] button with on action event [selectedTRAINER]
    public void selectedTRAINER(ActionEvent event)throws IOException {

        Parent homeViewParent = FXMLLoader.load(getClass().getResource("TRAINER.fxml"));
        Scene homeViewScene = new Scene(homeViewParent);

        //this line gets the information
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(homeViewScene);
        window.show();
    }

    //Select [PLANS SCREEN] button with on action event [selectedPLANS]
    public void selectedPLANS(ActionEvent event)throws IOException {

        Parent homeViewParent = FXMLLoader.load(getClass().getResource("PLANS.fxml"));
        Scene homeViewScene = new Scene(homeViewParent);

        //this line gets the information
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(homeViewScene);
        window.show();
    }
}
