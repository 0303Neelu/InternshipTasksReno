import java.util.Scanner;

class Pass{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Ente the mark 1:");
    byte m1=sc.nextByte();
    System.out.print("Ente the mark 2:");
    byte m2=sc.nextByte();
    System.out.print("Ente the mark 3:");
    byte m3=sc.nextByte();
    float avg=(m1+m2+m3)/3.0f;
    if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
      System.out.println("Congratulations, you have passed");
    }
    else{
      System.out.println("Sorry, you have failed");
    }
    sc.close();
  }
}