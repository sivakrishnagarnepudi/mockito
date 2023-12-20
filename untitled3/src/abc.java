public class abc {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++)
         {
                System.out.print("*");

        }
            System.out.println(" ");
        }


        for (int k = 5; k <= 5; k++) {
            for (int l = -1; l <= k; l++) {
                for (int m = l + 1; m <= k; m++) {
                    System.out.print("*");
                }
                System.out.println(" "+" ");
            }
        }
    }
}

