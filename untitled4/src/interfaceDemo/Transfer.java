package interfaceDemo;

public class Transfer {
    int toAccountNo;
    int amount;

    public Transfer(int toAccountNo, int amount) {

        this.toAccountNo = toAccountNo;
        this.amount = amount;
    }

    public int getToAccountNo() {
        return toAccountNo;
    }

    public int getAmount() {
        return amount;
    }
}
