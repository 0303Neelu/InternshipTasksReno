class PatternWhile{
    public static void main(String[] args){
      int n=4;
      int i=0;
      while(n>0){
        i=0;
        while(i<n){
          System.out.print("*");
          i++;
        }
        n--;
        System.out.println();
      }
    }
  }