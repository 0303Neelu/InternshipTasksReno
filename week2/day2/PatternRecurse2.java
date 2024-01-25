public class PatternRecurse2 {
    public static void main(String[] args) {
        int n=5;
        printPattern(n,0);
    }

    public static void printPattern(int n,int dummy){
        if(dummy==n){
            return;
        }
        else {
            for(int i=0;i<=dummy;i++){
                System.out.print("* ");
            }
            System.out.println();
        }
        printPattern(n,dummy+1);
    }
}
