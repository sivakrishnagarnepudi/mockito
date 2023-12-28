package example;
public class Example {
    public static int count=10;
    public int stuId=100;
    public void addTeacher(){
        count=count+1;
        stuId=stuId+count+1;
        System.out.println(count);
        System.out.println(stuId);
    }
    public static void main(String args []){
        Example e=new Example();
        e.addTeacher();
        Example e2=new Example();
        e2.addTeacher();
        Example e3=new Example();
        e3.addTeacher();
    }
}