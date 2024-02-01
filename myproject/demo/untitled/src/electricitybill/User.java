package electricitybill;

public class User {
    Address address =new Address("AndhraPradesh","ChandraGudem",3-128,521230);
    CustomerMeterDetails customerMeterDetails=new CustomerMeterDetails("SivaKrishna",address,"22/12/2023","22/1/2024");
    ElectracityBill electracityBill=new ElectracityBill(280,500);
    public static void main(String[]args){
       User user =new User();
        System.out.println(user.customerMeterDetails);
      //  System.out.println(user.address);
        System.out.println(user.electracityBill);
        System.out.println(user.electracityBill.calculateBill());


    }
}
