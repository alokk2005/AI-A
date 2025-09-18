package Unit3;

import java.util.ArrayList;
import java.util.Collections;

public class StudentObjects {
    public static void main(String[] args) {
        ArrayList<Student> stobj=new ArrayList<>();
        stobj.add(new Student(21,"Vijay",100));
        stobj.add(new Student(20,"Julia",101));
        stobj.add(new Student(18,"Abhi",102));
        stobj.add(new Student(30,"Ram",103));
        stobj.add(new Student(40,"Rohit",104));
        stobj.add(new Student(50,"Aryan",105));

        Collections.sort(stobj);

        for(Student s:stobj){
            System.out.println("Name "+s.name+" Age "+s.age+" RollNo "+s.roll_no);
        }
    }

}
