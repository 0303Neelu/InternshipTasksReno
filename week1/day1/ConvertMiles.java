import java.util.*;

class ConvertMiles{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the kilometers:");
    int kilometers=sc.nextInt();
    double converstion=0.621371;
    double miles=((double)kilometers)*converstion;
    System.out.println(kilometers+" kilometers is equal to "+miles+" miles.");
    sc.close();
  }
}