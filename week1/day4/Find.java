import java.util.*;

class Find{
  public static void main(String[] args){
    System.out.print("Enter the string:");
    Scanner sc=new Scanner(System.in);
    String a=sc.nextLine();
    if(a.endsWith(".org")){
      System.out.println("organization website");
    }
    else if(a.endsWith(".com")){
      System.out.println("commercial website");
    }
    else if(a.endsWith(".in")){
      System.out.println("Indian website");
    }
    sc.close();
  }
}