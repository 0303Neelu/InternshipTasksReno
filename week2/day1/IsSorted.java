public class IsSorted {
    public static void main(String[] args) {
        int[] a={1,2,3,3,4,5};
        boolean issorted=true;
        for(int i=0;i<a.length-1;i++){
            if(a[i]>a[i+1]){
                issorted=false;
                break;
            }
        }
        if(issorted){
            System.out.println("The array is in sorted order");
        }
        else{
            System.out.println("The array is not in sorted order");
        }
    }
}
