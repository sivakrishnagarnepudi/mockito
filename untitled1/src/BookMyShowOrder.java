import model.Ticket;

public class BookMyShowOrder {
    public int getPrice(int seats,int cost,int row){
        return seats*cost;
    }

    public void getTickets(int seats,int cost,int row,BookMyShowGateway gateway,String url){
     int price=getPrice(seats, cost, row);
     BookMyShowGateway.
    }
    public Ticket Orderconformation(int seats,int row,int price){
        return new Ticket(seats,row,price);

    }
}
