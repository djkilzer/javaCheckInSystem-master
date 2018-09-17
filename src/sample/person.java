package sample;


import javafx.beans.property.SimpleStringProperty;

public class person {

    private  SimpleStringProperty userID;
    private  SimpleStringProperty firstName;
    private  SimpleStringProperty lastName;
    private  SimpleStringProperty userAddress;
    private  SimpleStringProperty phoneNumber;
    private SimpleStringProperty assignedTrainer;


    //CREATE A CLIENT CONSTRUCTOR
    public person(String id, String first, String last, String address, String phone, String trainer) {
        this.userID = new SimpleStringProperty(id);
        this.firstName = new SimpleStringProperty(first);
        this.lastName = new SimpleStringProperty(last);
        this.userAddress = new SimpleStringProperty(address);
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




    //To String Methods

    public String toStringT()
    {
        return String.format("%s %s %s %s ", userID, firstName, lastName, phoneNumber);
    }
    public String toString()
    {
        return String.format("%s %s %s %s %s %s", userID, firstName, lastName, userAddress, phoneNumber, assignedTrainer);
    }


}

