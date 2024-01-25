public class FindMin {
    public static void main(String[] args) {
        int[] a={5,7,2,3,8,9};
        int min=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println("The minimum number in the array is "+min);
    }
}
