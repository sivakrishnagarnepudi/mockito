public class Blinkit {
    public Groceries items(int amount){
       Groceries groceries= new Groceries(1,"1kg",1,"Tenali Doble Heart Mills 1 Kg");
       return groceries;
    }
    public static void main (String[]args){
        Blinkit blinkit=new Blinkit();


        System.out.println(blinkit.items(599));
    }
}
