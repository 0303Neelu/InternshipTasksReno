import java.util.*;

public class TableMethod{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number n:");
        int n=sc.nextInt();
        printMult(n);
        sc.close();
    }

    public static void printMult(int n){
        for(int i=1;i<=10;i++){
            System.out.println(i + " * " + n + " = " + i*n);
        }
    }
}