package model;

public class UserDetails {
    public String userName;
    public String passWord;
    public int maxAttempts=3;
    public int leftAttempts;
    public String inputUserDetails(String inputUserName,String inputPassWord){
        if(userName.equals(inputUserName)&&passWord.equals(inputPassWord)){
            System.out.println("login successfully completed");
        } else if (leftAttempts<maxAttempts) {
            for(leftAttempts=0;leftAttempts<=maxAttempts;leftAttempts++){
                System.out.println("login failed");
                System.out.println("Remaining credentials left is "+leftAttempts);
        }




        }
        if (maxAttempts>3){
            System.out.println("you are account is locked");

        }
        else{
            System.out.println("you are account is locked");
        }
        return "login failed";
    }

    public static void main(String[] args) {
        UserDetails userDetails=new UserDetails();
        userDetails.userName="siva";
        userDetails.passWord="1234";
        userDetails.leftAttempts=0;
        userDetails.inputUserDetails("siva","134");



    }
}
