package jdkarray;

public class User {
    public static void main (String args[]) {
        Student[] values = new Student[2];
        Student[] objects=new Student[2];
        Student s1=new Student("Siva",11);
        Student s2=new Student("Sudheer",12);
        Student s3 =new Student("Sasank",13);
        Student s4 =new Student("Gopi",14);
        Student s5=new Student("Chandan",15);
        values[0]=s1;
        values[1]=s2;
        values[2]=s3;
        values[3]=s4;
        values[4]=s5;
        objects[0]=s1;
        objects[1]=s2;
        objects[2]=s3;
        objects[3]=s4;
        objects[4]=s5;
        for (int i=0;i< values.length;i++){
            System.out.println(values[i].name);
            System.out.println(values[i].rollNo);
            System.out.println();
        }
        s1.setName("sasank");
        for (int j=0;j< objects.length;j++){
            System.out.println(objects[j].name+" "+objects[j].rollNo);
           System.out.println(objects[j].name);

        }



    }
}
