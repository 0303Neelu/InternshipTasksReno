import java.util.*;

class ExpressionResult2{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the ending velocity V:");
    float v=sc.nextFloat();
    System.out.print("Enter the starting velocity U:");
    float u=sc.nextFloat();
    System.out.print("Enter the displacement S:");
    float s=sc.nextFloat();
    System.out.print("Enter the accleration a:");
    float a=sc.nextFloat();
    float total=(v*v-u*u)/(2*a*s);
    System.out.println("The result is "+total);
    sc.close();
  }
}