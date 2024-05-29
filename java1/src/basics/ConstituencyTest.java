package basics;

public class ConstituencyTest {
    public static void main(String[] args) {
        ElectionServices electionServices=new ElectionServices();
      State state=  electionServices.getState();
        System.out.println(state.constituencies[0].name);
        System.out.println(state.constituencies[0].noOfVoters);
        System.out.println(state.constituencies[0].type);

        System.out.println(state.stateName);
    }
}
