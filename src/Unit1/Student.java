package Unit1;//public class Student {
//    int roll_no;
//    public String name;
//    private String banking_password;
//    Student(int r , String n){
//        name=n;
//        roll_no=r;
//    }
//
//    void display(){
//        System.out.println("Roll No: "+roll_no);
//        System.out.println("Name: "+name);
//    }
//}

public  class Student {

    public int roll_no;
    public String name;
    private String grade;

    public Student(int roll_no, String name, String grade) {
        this.roll_no = roll_no;
        this.name = name;
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}