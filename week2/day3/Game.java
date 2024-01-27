class Tommy{
    public void hit(){
      System.out.println("Hitting the enemy...");
    }
  
    public void run(){
      System.out.println("Running from the enemy...");
    }
    
    public void fire(){
      System.out.println("Firing on the enemy...");
    }
  }
  
  class Game{
    public static void main(String[] args){
      System.out.println("Game is running...");
      Tommy t=new Tommy();
      t.hit();
      t.run();
      t.fire();
    }
  }