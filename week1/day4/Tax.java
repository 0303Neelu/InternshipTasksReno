import java.util.*;

class Tax{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the salary:");
    int salary=sc.nextInt();
    float tax=0;
    if(salary<=250000){
      System.out.println("No tax");
    }
    else if(salary>250000 && salary<=500000){
      tax=tax+0.05f*(salary-250000);
    }
    else if(salary>500000 && salary<=1000000){
      tax=tax+0.2f*(salary-500000);
    }
    else{
      tax=tax+0.3f*(salary-1000000);
    }
    System.out.println("The tax payable is:"+tax);
    sc.close();
  }
}