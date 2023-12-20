package client;

import model.Orderitem;

public class Siva extends Orderitem{
    public Siva(String item, int quantity) {
        super(item, quantity);
    }

    public static void Main(String args[]){
        Orderitem order = new Orderitem("Biryani",2);

        System.out.println(order.getitems());
        System.out.println(order.getQuantity());


    }


}

