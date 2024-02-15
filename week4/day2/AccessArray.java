import java.util.*;

public class AccessArray{
    public static void main(String[] args) {
        boolean flag=true;
        int[] arr = new int[3];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        Scanner sc = new Scanner(System.in);
        int index;
        int i=0;
        while(flag && i<5){
            try{
                System.out.println("Enter the valid index");
                index=sc.nextInt();
                System.out.println("The value for the index in the array is :"+arr[index]);
                break;
            }
            catch(Exception e){
                System.out.println("Invalid index");
                i++;
            }
        }
    }
}