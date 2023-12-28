package methodoverridingstatic;

public final class Son extends Father{
    public static void father(){
       // String name="siva";
        System.out.println("NarasimhaRao");
    //  return name;
    }
    public static void main (String args[]){
        Father father =new Father();
        father.father();

        Son father2=new Son();
        father2.father();
        Father father1=new Son();
        father1.father();


    }

}


