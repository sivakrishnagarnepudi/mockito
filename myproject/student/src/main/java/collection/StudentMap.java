package collection;

import java.util.Objects;

public class StudentMap {
    int rollNo;
    String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentMap that = (StudentMap) o;
        return rollNo == that.rollNo && name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo, name);
    }

    public StudentMap(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }
}
