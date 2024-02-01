package electricitybill;

public class CustomerMeterDetails {
    public String userName;
    public Address address;
    public String previousMonthDate;
    public String currentMonthDate;

    public CustomerMeterDetails(String userName, Address address, String previousMonthDate, String currentMonthDate) {
        this.userName = userName;
        this.address = address;
        this.previousMonthDate = previousMonthDate;
        this.currentMonthDate = currentMonthDate;
    }

    @Override
    public String toString() {
        return "CustomerMeterDetails{" +
                "userName='" + userName + '\'' +
                ", address=" + address +
                ", previousMonthDate=" + previousMonthDate +
                ", currentMonthDate=" + currentMonthDate +
                '}';
    }
}
