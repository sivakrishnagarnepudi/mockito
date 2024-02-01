package movie;

public class Pvrmovies {
    String movieName;


    public Pvrmovies(String movieName) {
        this.movieName = movieName;
    }

    public int movieTicket(){
        int seatNo=1;
        int rows=1;
        int cost=0;
        for (int i=1;i<10;i++){
            for (int j=1;j<11;j++){
                System.out.print("seatNO"+seatNo+" ");
                seatNo++;
            }
            System.out.println("row"+rows);
            rows++;
        }


        r   eturn cost;
    }
    public static void main(String[]args){
        Pvrmovies pvrmovies=new Pvrmovies("OG");
        System.out.println(pvrmovies.movieTicket());
        System.out.println(pvrmovies);
    }

    @Override
    public String toString() {
        return "Pvrmovies{" +
                "movieName='" + movieName + '\'' +
                '}';
    }
}
