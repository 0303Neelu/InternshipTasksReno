import java.util.*;

class Factorial{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number to calculate the factorial:");
    int n = sc.nextInt();
    int fact=1;
    for(int i=1;i<=n;i++){
      fact=fact*i;
    }
    System.out.println("The factorial of "+n+" is "+fact);
    sc.close();
  }
}