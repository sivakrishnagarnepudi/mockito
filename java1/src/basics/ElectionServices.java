package basics;

public class ElectionServices {
    public State getState(){
        State tg=new State();
        tg.stateName="TG";

        Constituencies[] constituencies=new Constituencies[2];
            Constituencies constituencies1=new Constituencies();
            tg.constituencies=constituencies;
            constituencies1.name="MIYAPUR";
            constituencies1.noOfVoters=100000;
            constituencies1.state=tg;
            constituencies1.type="MP";
            constituencies[0]=constituencies1;
            return tg;

    }
}
