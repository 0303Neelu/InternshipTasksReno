import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number to be searched:");
        int n=sc.nextInt();
        int flag=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==n){
                System.out.println("Number is found at index "+i+".");
                flag=1;
            }
        }
        if(flag==0){
            System.out.println("The given element is not present in array.");
        }
        sc.close();
    }
}
