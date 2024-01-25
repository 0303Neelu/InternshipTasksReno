public class FindMax {
    public static void main(String[] args) {
        int[] a={5,7,2,3,8,9};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println("The maximum number in the array is "+max);
    }
}
