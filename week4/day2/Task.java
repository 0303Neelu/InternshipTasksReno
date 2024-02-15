import java.util.InputMismatchException;
import java.util.Scanner;

class MaxInputException extends Exception{
    @Override
    public String toString(){
        return "input is very length";
    }

    @Override
    public String  getMessage() {
        return "Enter the input that is below 100000";
    }

}

class MaxMultiplyException extends Exception{
    @Override
    public String toString(){
        return "input is very length";
    }
    public String  getMessage() {
        return "Enter the input that is below 100000";
    }

}

public class Task {
    public static int addition(int a,int b) throws ArithmeticException,MaxInputException{
        if(a>100000||b>100000){
            throw new MaxInputException();
        }
        return a+b;
    }

    public static int subtract(int a,int b) throws ArithmeticException,MaxInputException{
        if(a>100000||b>100000){
            throw new MaxInputException();
        }
        return a-b;
    }

    public static int multiply (int a,int b) throws ArithmeticException,MaxMultiplyException{
        if(a>7000||b>7000){
            throw new MaxMultiplyException();
        }
        return a*b;
    }

    public static double divide(int a,int b) throws  ArithmeticException,MaxInputException{
        if(a>100000||b>100000){
            throw new MaxInputException();
        }
        return (double)a/b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Enter the input1:");
            int a=sc.nextInt();
            System.out.print("Enter the input2:");
            int b=sc.nextInt();

            System.out.println("Addition :"+addition(a, b));
            System.out.println("Subtraction : "+subtract(a, b));
            System.out.println("Multiplication :"+multiply(a, b));
            System.out.println("Division : "+divide(a, b));

        }
        catch(InputMismatchException e){
            System.out.println("enter valid input");
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println("Error");
            System.out.println(e);
        }
    }
}
