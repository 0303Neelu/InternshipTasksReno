class CellPhone{
    public void ring(){
      System.out.println("Ringing...");
    }
  
    public void vibrating(){
      System.out.println("Vibrating...");
    }
  
    public void callFriend(){
      System.out.println("Calling friend...");
    }
  }
  
  class Problem2{
    public static void main(String[] args){
      CellPhone moto=new CellPhone();
      moto.callFriend();
      moto.ring();
      moto.vibrating();
    }
  }