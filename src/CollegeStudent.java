import org.w3c.dom.ls.LSOutput;

public class CollegeStudent extends Student1 {
    public int rollno;

    public CollegeStudent(String address, int rollno) {
        super(address);
        this.rollno = rollno;
    }
    public void show_rollno(){
        System.out.println("Roll no : "+rollno);
    }
}
