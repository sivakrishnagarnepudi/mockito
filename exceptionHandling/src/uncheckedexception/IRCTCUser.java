package uncheckedexception;

public class IRCTCUser {
    public static void main (String[]args){
        try {
            IRCTCController controller=new IRCTCController();
             String checking=    controller.irctcRepository("4712072145","D5:45");
            System.out.println(checking);
        }catch (InvalidirctcException e){
            System.out.println(e.getErrorCode().toString()+"   "+e.getMessage());
        }
    }
}
