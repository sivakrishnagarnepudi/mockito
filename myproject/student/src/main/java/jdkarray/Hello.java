package jdkarray;

public class Hello {
    public static void main (String args[]) {
        int[] value = {1, 2, 3, 4, 5};
        int[] array1 = new int[5];
        array1[0] = 12;
        array1[1] = 15;
        array1[2] = 4;
        array1[3] = 6;
        array1[4] = 7;


        for (int i = 0; i < value.length; i++) {
            System.out.println("value elements:"+" "+value[i]);
        }

        for (int j = 0; j < array1.length; j++) {
            System.out.print("array1 elements :"+" " +array1[j]);
        }


    }
}
