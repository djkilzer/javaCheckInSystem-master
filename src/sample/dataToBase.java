package sample;


import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/*
public class dataToBase implements Initializable {

        @FXML
        private Label label;
        @FXML
        private TableView<person> tableClients;
        @FXML
        private TableColumn<person, String> columnID;
        @FXML
        private TableColumn<person, String> columnFirstName;
        @FXML
        private TableColumn<person, String> columnLastName;
        @FXML
        private TableColumn<person, String> columnPhoneNumber;
        @FXML
        private TableColumn<person, String> columnAddress;
        @FXML
        private TableColumn<person, String> columnTrainer;
        @FXML
        private Button btnLoad;
        @FXML
        private Button refreshDB;

        //Initialize observable list to hold out database data
        private ObservableList<person> data;
        private ConnectDB dc;

        @Override
        public void initialize(URL url, ResourceBundle rb) {
            // TODO
            dc = new ConnectDB();
        }

        @FXML
        private void refreshDB(ActionEvent event) {
            try {
                Connection conn = dc.Connect();
                data = FXCollections.observableArrayList();
                // Execute query and store result in a resultset
                ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM clients");
                while (rs.next()) {
                    //get string from db,whichever way
                    data.add(new UserDetails(rs.getString(2), rs.getString(3), rs.getString(4)));
                }

            } catch (SQLException ex) {
                System.err.println("Error"+ex);
            }

            //Set cell value factory to tableview.
            //NB.PropertyValue Factory must be the same with the one set in model class.
            columnName.setCellValueFactory(new PropertyValueFactory<>("name"));
            columnEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
            columnDepartment.setCellValueFactory(new PropertyValueFactory<>("department"));

            tableUser.setItems(null);
            tableUser.setItems(data);

        }

    }
*/