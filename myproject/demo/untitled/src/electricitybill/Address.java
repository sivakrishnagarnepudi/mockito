package electricitybill;

public class Address {
    public String state;
    public String village;
    public int doorNo;
    public int pinCode;

    public Address(String state, String village, int doorNo, int pinCode) {
        this.state = state;
        this.village = village;
        this.doorNo = doorNo;
        this.pinCode = pinCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "state='" + state + '\'' +
                ", village='" + village + '\'' +
                ", doorNo=" + doorNo +
                ", pinCode=" + pinCode +
                '}';
    }
}
