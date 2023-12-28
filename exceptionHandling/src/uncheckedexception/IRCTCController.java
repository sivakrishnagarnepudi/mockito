package uncheckedexception;

public class IRCTCController {
    public String irctcRepository(String pnrNo, String seatNo){
        IRCTCService irctcService=new IRCTCService();
        try {
            return irctcService.irctcRepository(pnrNo, seatNo);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }

    }
}
