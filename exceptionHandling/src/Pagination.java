
    public class Pagination {
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5, 6, 7};
            int pageSize=2;
            int temp=arr.length%pageSize;
            int nop= arr.length/pageSize;
            if(temp>0)
            {
                nop=(arr.length/pageSize)+1;
            }
            for(int i=0;i<nop;i++){
                System.out.println(nop);
            }


        }
    }


