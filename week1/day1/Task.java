import java.util.*;

class Task{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the marks for 5 subjects out of 100:");
      System.out.print("Enter the marks for 1st subject:");
      int num1=sc.nextInt();
      System.out.print("Enter the marks for 2nd subject:");
      int num2=sc.nextInt();
      System.out.print("Enter the marks for 3rd subject:");
      int num3=sc.nextInt();
      System.out.print("Enter the marks for 4th subject:");
      int num4=sc.nextInt();
      System.out.print("Enter the marks for 5th subject:");
      int num5=sc.nextInt();
      int total=num1+num2+num3+num4+num5;
      float percentage=(float)total/5;
      System.out.println("Total marks:"+total);
      System.out.println("Percentage:"+percentage);
    sc.close();
  }
}