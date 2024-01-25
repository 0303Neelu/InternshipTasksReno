public class Marks {
    public static void main(String[] args) {
        int marks[]={97,90,93,75,86,92};
        int sum=0;
        for(int i:marks){
            sum+=i;
        }
        System.out.println("The average is = "+(float)sum/marks.length);
    }
}
