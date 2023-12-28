package jdkarray;

import java.util.Locale;

public class Student {
public String name;
public int  rollNo;






    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }


    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;

    }
    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

}
