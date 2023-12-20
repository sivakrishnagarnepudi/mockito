package referanceVariable;

public class Address {
    int doorNo;
    String street;


    public int getDoorNo() {
        return doorNo;
    }

    public String getStreet() {
        return street;
    }

    public Address(int doorNo, String street) {
        this.doorNo = doorNo;
        this.street = street;
    }

}
