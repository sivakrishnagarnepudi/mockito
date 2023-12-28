package collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Hello {
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(1);
        list.add(5);
        list.add(15);
        list.add(20);
        for (int i=0;i< list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
