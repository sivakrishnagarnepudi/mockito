public class Pagenation {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8,9,10};
        int pageSize=2;

        int noofPages =arr.length/pageSize;//10/2=5

        System.out.println();
        for(int i=0;i<noofPages;i++){
            for(int j=i*(pageSize);j<pageSize+i*pageSize;j++){
                System.out.println("  i  "+i+" j "+j+"  elements  "+arr[j]);
            }

        }
//1*2=2+1;j=0<2+0*2
    }
}
