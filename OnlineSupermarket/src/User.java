import Address.Address;

public class User {
   
    private String userName;
    private String cardID;
    private String phoneNumber;
    private String password;
    private Address address = new Address();

    public User(String userName, String cardID, String phoneNumber, String password) {
        this.userName = userName;
        this.cardID = cardID;
        this.phoneNumber = phoneNumber;
        this.password = password;

    }

    public String getUserName() {
        return userName;
    }

    public String getCardID() {
        return cardID;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return userName + " " + cardID + " " + phoneNumber + " " + password + " " + address;
    }
    
    

}
