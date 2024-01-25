public class Average {
    public static void main(String[] args) {
        double average=findAve(1,5,4,2,3);
        System.out.println("The average is ="+average);
    }

    public static double findAve(int a,int b,int c,int d,int e){
        double sum = (a+b+c+d+e)/5;
        return sum;
    }
}
