package checkedexception;

import uncheckedexception.IRCTCService;

public class IRCTCController {
    public String irctcRepository(String pnrNo, String seatNo){
        uncheckedexception.IRCTCService irctcService=new IRCTCService();
        try {
            return irctcService.irctcRepository(pnrNo, seatNo);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }

    }
}
