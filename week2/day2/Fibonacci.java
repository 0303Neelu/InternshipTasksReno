import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number n:");
        int n=sc.nextInt();
        int a=findFibo(n);
        System.out.println("The fibonacci term is = "+a);
        sc.close();
    }

    public static int findFibo(int n){
        if(n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        }
        else {
            return findFibo(n-1)+findFibo(n-2);
        }
    }
}