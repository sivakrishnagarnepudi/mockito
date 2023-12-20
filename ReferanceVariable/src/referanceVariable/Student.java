package referanceVariable;

public class Student {

    private String name;
    private int rollNo;
    private int mobileNo;



    private Address address;



    public Student(String name, int rollNo, int mobileNo, Address address) {
        this.name = name;
        this.rollNo = rollNo;
        this.mobileNo = mobileNo;
        this.address=address;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public int getMobileNo() {
        return mobileNo;
    }
    public Address getAddress() {
        return address;
    }

}
