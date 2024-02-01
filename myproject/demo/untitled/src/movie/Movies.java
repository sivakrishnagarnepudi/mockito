package movie;

public class Movies {
    static int seats;
    static int rows;
    String movieName;
    public Movies(String movieName) {
        this.movieName = movieName;
    }
    public void movie(){
        for (rows = 0; rows <= 100; rows++) {
            rows = rows++;
            System.out.println("rows: " + rows);
        }
        for (seats = 0; seats <= 100; seats++) {
            seats = seats++;
            System.out.println("seats: " + seats);

        }
    }




}
