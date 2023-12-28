package collection;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StringListExample {



    static Predicate<Student> countryPredicate =(i) ->i.getCountry().equalsIgnoreCase("India");
        public static  void main (String args[]){
            List<Student> studentList=new ArrayList<>();
            Student s1=new Student("POLLARD","WESTINDIES");
            Student s2=new Student("BAIRSTOW","UK");
            Student s3=new Student("MARK","USA");;
            Student s4=new Student("MALLESH","INDIA");
            studentList.add(s1);
            studentList.add(s2);
            studentList.add(s3);
            studentList.add(s4);


            List<String> countryObj =new ArrayList<>();
            for (int i=0;i<studentList.size();i++){
                if (countryPredicate.test(studentList.get(i))){
                    countryObj.add((studentList.get(i).getName()));
                }

            }
            System.out.println(countryObj);

            List<Student> streamCountryPredicate= studentList.stream()
                    .filter( countryPredicate)
                    //.map(Student::getName)
                    .collect(Collectors.toList());
            System.out.println("streamed passed Students:"+streamCountryPredicate);


        }
    }


