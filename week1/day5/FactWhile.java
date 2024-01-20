import java.util.*;

class FactWhile{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number to calculate the factorial:");
    int n = sc.nextInt();
    int fact=1;
    int i=1;
    while(i<=n){
      fact=fact*i;
      i++;
    }
    System.out.println("The factorial of "+n+" is "+fact);
    sc.close();
  }
}