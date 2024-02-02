import java.util.Scanner;

public class BuildIn {
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        System.out.println("Enter the message:");
        String s=read.nextLine();
        System.out.println("The message is : "+ s);
        read.close();
    }
}
