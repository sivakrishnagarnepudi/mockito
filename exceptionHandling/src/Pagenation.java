public class Pagenation {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int pageSize=2;
        int lastIndex=arr.length/pageSize;
        if(lastIndex!=0){
            lastIndex=lastIndex+1;
        }
        System.out.println(lastIndex);
        for(int i=0;i<lastIndex;i++){
            for(int j=i*pageSize;j<pageSize+i*pageSize;j++){
                System.out.println("  i  "+i+" j "+j+"  elements  "+arr[j]);
            }

        }

    }
}

