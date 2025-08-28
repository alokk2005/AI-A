// Step 2 cont.
public class UseDefinedException {
    public void validate(int age)throws  InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("Not Eligible to vote age less than 18");
        }else{
            System.out.println("Eligible to vote");
        }
    }
}
