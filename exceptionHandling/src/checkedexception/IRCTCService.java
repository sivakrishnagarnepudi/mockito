package checkedexception;

import uncheckedexception.ErrorCode;
import uncheckedexception.IRCTCRepository;
import uncheckedexception.InvalidirctcException;

public class IRCTCService {
    public String irctcRepository(String pnrNo, String seatNo) {
        String unchecked = "0";
        try {
            IRCTCRepository irctc = new IRCTCRepository();
            unchecked = irctc.irctcRepository(pnrNo, seatNo);
        } catch (Exception e) {
            System.out.println("error message" + e.getMessage());
            throw e;


        }
        return unchecked;

    }
}
