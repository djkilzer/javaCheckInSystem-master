
import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class tableView extends Application {

    private final TableView<person> table = new TableView<>();
    private final ObservableList<person> data =
            FXCollections.observableArrayList(

                    //Use [6] String arguments to make a new client.
                    //public person(String id, String first, String last, String address, String number, String Trainer)
                    new person("1","Benjamin","Salazar","10727 Sagebluff Dr.","281-940-4678","Bucky" ),
                    new person("2","Kevin","Sanchez","10727 Sagebluff Dr.","281-940-4678","Bucky" ),
                    new person("3","Howard","Cole","10727 Sagebluff Dr.","281-940-4678","Bucky" )
            );

    public void showTable(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        Scene scene = new Scene(new Group());
        stage.setTitle("CLIENT LIST");
        stage.setWidth(800);
        stage.setHeight(500);

        final Label label = new Label("Gym Clients");
        label.setFont(new Font("Arial", 20));

        table.setEditable(true);

        TableColumn columnMemberID = new TableColumn("Member ID");
        columnMemberID.setMinWidth(100);
        columnMemberID.setCellValueFactory(
                new PropertyValueFactory<>("userID"));

        TableColumn columnFirstName = new TableColumn("First Name");
        columnFirstName.setMinWidth(100);
        columnFirstName.setCellValueFactory(
                new PropertyValueFactory<>("firstName"));

        TableColumn lastNameCol = new TableColumn("Last Name");
        lastNameCol.setMinWidth(150);
        lastNameCol.setCellValueFactory(
                new PropertyValueFactory<>("lastName"));

        TableColumn userAddressCol = new TableColumn("Address");
        userAddressCol.setMinWidth(150);
        userAddressCol.setCellValueFactory(
                new PropertyValueFactory<>("userAddress"));

        TableColumn phoneNumberCol = new TableColumn("Phone Number");
        phoneNumberCol.setMinWidth(150);
        phoneNumberCol.setCellValueFactory(
                new PropertyValueFactory<>("phoneNumber"));

        TableColumn trainerCol = new TableColumn("Trainer");
        trainerCol.setMinWidth(150);
        trainerCol.setCellValueFactory(
                new PropertyValueFactory<>("assignedTrainer"));

        table.setItems(data);
        table.getColumns().addAll(columnMemberID,columnFirstName, lastNameCol, userAddressCol, phoneNumberCol, trainerCol);

        final VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 0, 0, 10));
        vbox.getChildren().addAll(label, table);

        ((Group) scene.getRoot()).getChildren().addAll(vbox);

        stage.setScene(scene);
        stage.show();
    }



    //person OBJECT

    public static class person {

        private final SimpleStringProperty userID;
        private final SimpleStringProperty firstName;
        private final SimpleStringProperty lastName;
        private final SimpleStringProperty userAddress;
        private final SimpleStringProperty phoneNumber;
        private final SimpleStringProperty assignedTrainer;


        //CREATE A CLIENT CONSTRUCTOR
        private person(String id, String first, String last, String address, String phone,String trainer) {
            this.userID = new SimpleStringProperty(id);
            this.firstName = new SimpleStringProperty(first);
            this.lastName = new SimpleStringProperty(last);
            this.userAddress= new SimpleStringProperty(address);
            this.phoneNumber = new SimpleStringProperty(phone);
            this.assignedTrainer = new SimpleStringProperty(trainer);
        }


        public String getUserID() {
            return userID.get();
        }

        public void setUserID(String id) {
            userID.set(id);
        }

        public String getFirstName() {
            return firstName.get();
        }

        public void setFirstName(String first) {
            firstName.set(first);
        }

        public String getLastName() {
            return lastName.get();
        }

        public void setLastName(String last) {
            lastName.set(last);
        }

        public String getUserAddress() {
            return userAddress.get();
        }

        public void setUserAddress(String address) {
            userAddress.set(address);
        }

        public String getPhoneNumber() {
            return phoneNumber.get();
        }

        public void setPhoneNumber(String number) {
            phoneNumber.set(number);
        }

        public String getAssignedTrainer() {
            return assignedTrainer.get();
        }

        public void setAssignedTrainer(String trainer) {
            assignedTrainer.set(trainer);
        }
    }
}

