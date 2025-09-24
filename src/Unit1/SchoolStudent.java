package Unit1;

//public class SchoolStudent extends Student{
//
//    SchoolStudent(int roll_no,String name){
//        super(roll_no,name);
//    }
//
//    public void attend_class(){
//        System.out.println(name+" is attending class offline");
//    }
//    public void give_exam(){
//        System.out.println(name+" is giving exam on pen and paper");
//    }
//}
//public class MyMain {
//    public static void main(String[] args) {
//
//        Student s1=new Student(28 , "alok");
//        s1.display();
//
//    }
//
public class SchoolStudent {
    public static void main(String[] args) {

        Student st= new Student(1 , "Alok" , "F");

        st.setGrade("Pass");
        System.out.println(st.getGrade());

    }
}

