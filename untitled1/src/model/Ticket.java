package model;

public class Ticket {
 private int seatnumber;
 private int row;
 private int price;




    public Ticket(int seatnumber, int row, int price) {
        this.seatnumber = seatnumber;
        this.row=row;
        this.price=price;
    }
    public int getSeatnumber() {
        return seatnumber;
    }
    public int getRow() {
        return row;
    }
    public int getPrice(){
        return price;
    }


}
