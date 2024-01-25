import java.util.*;

public class SumRecurse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number n:");
        int n=sc.nextInt();
        int sum=findSum(n);
        System.out.println("The sum of first " + n +" number is = "+sum);
        sc.close();
    }

    public static int findSum(int n){
        if(n==1){
            return 1;
        }
        return n+findSum(n-1);
    }

}
