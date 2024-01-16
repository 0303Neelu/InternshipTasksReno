import java.util.*;

class FindGreater {
  public static void main(String[] args){
    int fixed=8;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a number:");
    int num=sc.nextInt();
    if(num>fixed){
      System.out.println("Entered number is Greater");
    }
    else{
      System.out.println("Entered number is Smaller");
    }
    sc.close();
  }
}