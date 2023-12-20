package model;

public class Orderitem {
    String item ;
    int quantity;
    public  Orderitem(String item, int quantity){
        this.item=item;
        this.quantity=quantity;}
    public String getitems(){
        return item;
    }
    public int getQuantity(){
        return quantity;
    }
}
