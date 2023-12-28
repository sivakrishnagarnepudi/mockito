package checkedexception;

import uncheckedexception.IRCTCController;
import uncheckedexception.InvalidirctcException;

public class IRCTCUser {
    public static void main (String[]args){
        try {
            uncheckedexception.IRCTCController controller=new IRCTCController();
            String checking=    controller.irctcRepository("4712072155","D5:45");
            System.out.println(checking);
        }catch (InvalidirctcException e){
            System.out.println(e.getErrorCode().toString()+"   "+e.getMessage());
        }
    }
}
