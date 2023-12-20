package interfaceDemo;

public class citi implements fundstransfer{

    @Override
    public void addBenficiary(int toAccountNo, String name) {
        System.out.println("add Benifiery account No"+toAccountNo+" add binificiary name"+name);
    }

    @Override
    public void addTransfer(int toAccountNo, int amount) {
        System.out.println("Add to account No"+toAccountNo+" add amount"+amount);

    }
}
