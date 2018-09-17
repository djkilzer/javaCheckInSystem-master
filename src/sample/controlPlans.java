package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class controlPlans {

    public class controlClient implements Initializable {



        @FXML
        private Label label;
        @FXML
        private TableView<person> clientTable;
        @FXML
        private TableColumn<person, String> columnMemberID;
        @FXML
        private TableColumn<person, String> columnFirstName;
        @FXML
        private TableColumn<person, String> columnLastName;
        @FXML
        private TableColumn<person, String> columnUserAddress;
        @FXML
        private TableColumn<person, String> columnPhone;
        @FXML
        private TableColumn<person, String> columnAssignedTrainer;
        @FXML
        private Button refreshDB, refreshDB2, RemoveClientButton, addClientButton;
        @FXML
        private TextField id, last, first, address, phone, trainer;

        //Initialize observable list to hold out database data
        private ObservableList<person> data;
        private ConnectDB dc;

        @Override
        public void initialize(URL url, ResourceBundle rb) {
            // TODO
            dc = new ConnectDB();
        }


        @FXML
        private void RefreshDB2(ActionEvent event) {
            try {
                Connection conn = dc.Connect();
                data = FXCollections.observableArrayList();
                // Execute query and store result in a resultset
                ResultSet rs;
                rs = conn.createStatement().executeQuery("SELECT * FROM clients");
                while (rs.next()) {
                    //get string from db,whichever way
                    data.add(new person(rs.getString(1),rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5),rs.getString(6)));
                }

            } catch (SQLException ex) {
                System.err.println("Error"+ex);
            }
        }



        //Add user from textField Inputs by clicking [ADD CLIENT]
        public void addClientButton(ActionEvent event) throws IOException {

            String clientID = id.getText();
            String clientFirst = first.getText();
            String clientLast = last.getText();
            String clientAddress = address.getText();
            String number = phone.getText();
            String userTrainer = trainer.getText();

            person client = new person(clientID,clientFirst,clientLast,clientAddress,number,userTrainer);
            System.out.println(client);

        }

        //Read data from the dataBase by clicking [REl0AD DB]
        @FXML
        private void refreshDB(ActionEvent event) {
            try {
                Connection conn = dc.Connect();
                data = FXCollections.observableArrayList();
                // Execute query and store result in a resultset
                ResultSet rs;
                rs = conn.createStatement().executeQuery("SELECT * FROM clients");
                while (rs.next()) {
                    //get string from db,whichever way
                    data.add(new person(rs.getString(1),rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5),rs.getString(6)));
                }

            } catch (SQLException ex) {
                System.err.println("Error"+ex);
            }
            System.out.println(data);


        }



        //PASS Data to the DB with the [ADD USER] button
        @FXML
        private void addClientClicked(ActionEvent event) {
            try {
                Connection conn = dc.Connect();
                data = FXCollections.observableArrayList();
                // Execute query and store result in a resultset
                ResultSet rs;
                String sql;
                sql = "INSERT INTO `clients` (`memberID`, `firstName`, `lastName`, `userAddress`, `phoneNumber`, `assignedTrainer`)" +
                        " VALUES ('" + id.getText()+ " ', '"+first.getText() +"', '"+ last.getText() +"', '"+ address.getText() +"', '"+ phone.getText() +"', '"+ trainer.getText()+"')";
                conn.createStatement().execute(sql);
            } catch (SQLException ex) {
                System.err.println("Error"+ex);
            }
        }




        //Select [GO BACK] button with on action event [selectedHOME]
        public void selectedHOME(ActionEvent event)throws IOException {

            Parent homeViewParent = FXMLLoader.load(getClass().getResource("HOME.fxml"));
            Scene homeViewScene = new Scene(homeViewParent);

            //this line gets the information
            Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
            window.setScene(homeViewScene);
            window.show();
        }



    }

}
