import java.util.*;

class SumEven{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number of elements: ");
    int n=sc.nextInt();
    int i=0;
    int sum=0;
    while(i<n){
      sum=sum+(2*i);
      i++;
    }
    System.out.println("The sum of first "+n+" even numbers is "+sum);
    sc.close();
  }
}