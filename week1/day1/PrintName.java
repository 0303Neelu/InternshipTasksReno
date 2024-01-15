
import java.util.*;

class PrintName {
  public static void main(String[] args) {
    System.out.print("Enter the Name:");
    Scanner sc = new Scanner(System.in);
    String name=sc.nextLine();
    System.out.println("Hello "+name+" have a good day!!");
    sc.close();
  }
}
