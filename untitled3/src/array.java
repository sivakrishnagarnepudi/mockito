public class array {
    public static void main(String[]args){
   //
   int [] value = {5, 2, 8, 7, 1};
    int s = 0;


        System.out.println("Elements of original array: ");
        for (int i = 0; i < value.length; i++) {
        System.out.print(value[i] + " ");
    }


        for (int i = 0; i < value.length; i++) {
        for (int j = i+1; j < value.length; j++) {
            if(value[i] > value[j]) {
                s = value[i];
                value[i] = value[j];
                value[j] = s;
            }
        }
    }

        System.out.println();

    //Displaying elements of array after sorting
        System.out.println("Elements of array sorted in ascending order: ");
        for (int i = 0; i < value.length; i++) {
        System.out.print(value[i] + " ");
    }
}

}
