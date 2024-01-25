public class PatternRecurse {
    public static void main(String[] args) {
        int n=4;
        printPattern(n);
    }

    public static void printPattern(int n){
        if(n<0){
            return;
        }
        else {
            for(int i=0;i<n;i++){
                System.out.print("* ");
            }
            System.out.println();
        }
        printPattern(n-1);
    }
}
