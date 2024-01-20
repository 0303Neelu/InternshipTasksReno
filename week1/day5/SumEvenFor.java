import java.util.*;

class SumEvenFor{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number of elements: ");
    int n=sc.nextInt();
    int sum=0;
    for(int i=0;i<n;i++){
      sum=sum+(2*i);
    }
    System.out.println("The sum of first "+n+" even numbers is "+sum);
    sc.close();
  }
}