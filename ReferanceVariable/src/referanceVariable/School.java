package referanceVariable;

public class School {
    String name;
    Address address;

    public School(String name, Address address) {
        this.name = name;
        this.address = address;
    }
    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }
}
