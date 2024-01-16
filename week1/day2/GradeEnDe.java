class GradeEnDe {
    public static void main(String[] args){
      char grade='A';
      grade=(char)(grade+8);
      //after encryption
      System.out.println(grade);
  
      //after decryption
      grade=(char)(grade-8);
      System.out.println(grade);
      
    }
  }