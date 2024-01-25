public class Pattern2Method {
    public static void main(String[] args) {
        int n=4;
        printPattern(n);
    }

    public static void printPattern(int n){
        for(int i=n;i>=0;i--){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
