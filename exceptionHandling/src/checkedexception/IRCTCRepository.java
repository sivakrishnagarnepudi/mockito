package checkedexception;

public class IRCTCRepository  {
    public String irctcRepository(String pnrNo, String seatNo) throws InvalidirctcException {
        String existingPnrNo="4712072155";
        String existingSeatNo="D5:45";

        // String display = "IRCTC food Site is Open";

        if(existingPnrNo.equalsIgnoreCase(pnrNo) && existingSeatNo.equalsIgnoreCase(existingSeatNo)){
            return "IRCTC food Site is Open";
        }
        else{
            throw new InvalidirctcException(ErrorCode.INVALID_PNR_NUMBER.toString(),"PNR Number is Wrong");
        }
    }

}
