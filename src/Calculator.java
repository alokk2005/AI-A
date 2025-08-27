import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x,y,z=0;

        System.out.print("Enter any two numbers: ");
        x = sc.nextInt();
        y = sc.nextInt();


        try{
            z=x/y;
            System.out.println("Exception not occurs");
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println(z);
        }
    }
}
