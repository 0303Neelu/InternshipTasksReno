import java.util.*;

class CheckInt{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number:");
    boolean num=sc.hasNextInt();
    if(num){
      System.out.println("It is an integer");
    }
    else{
      System.out.println("It is not an integer");
    }
    sc.close();
  }
}