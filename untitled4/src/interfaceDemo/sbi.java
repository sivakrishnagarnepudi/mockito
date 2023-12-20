package interfaceDemo;

public class sbi implements  fundValidation {

private boolean addValidation=false;
    @Override
    public void addValidation(String userName, String passWord) {
       if (userName.equals("Siva") && passWord.equals("123@siva")){
           addValidation=true;
            System.out.println("Verification is Successfull");
        }
       else {
           System.out.println("invalid user inputs");
       }
    }

    @Override
    public void addBenficiary(int toAccountNo, String name) {
        System.out.println("add Benifiery account No: " + toAccountNo+" add binificiary name : " + name);

    }

    @Override
    public void addTransfer(int toAccountNo, int amount) {
        if (addValidation) {
            System.out.println("Add to account No" + toAccountNo + " add amount" + amount);
        }
        else{
            System.out.println("First You Should Enter your Credentials ");
        }
    }

}
