class Problem3 {
    public static void main(String[] args){
      String letter="Dear <|name|> , Thanks a lot";
      letter=letter.replace("<|name|>","Neela");
      System.out.println(letter);
    }
  }