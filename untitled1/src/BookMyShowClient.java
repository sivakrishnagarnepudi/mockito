import model.Ticket;

public class BookMyShowClient {
    public static void main(String args[]){
        BookMyShowGateway gateway=new HDFCBankProxy();
        gateway.forward();
        BookMyShowOrder order=new BookMyShowOrder();
        Ticket ticket=order.getTickets(2,100,3,HDFCBankProxy,8080);

    }
}
