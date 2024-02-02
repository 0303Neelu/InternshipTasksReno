abstract class Pen{
  abstract void write();
  abstract void refill();
}

class FountainPen extends Pen{
  void write(){
    System.out.println("Writing with Fountain Pen");
  }
  void refill(){
    System.out.println("Refilling Fountain Pen");
  }

  void changeNib(){
    System.out.println("Changing the nib");
  }
}

public class PenClass{
  public static void main(String[] args){
    FountainPen pen1 = new FountainPen();
    pen1.write();
    pen1.refill();
    pen1.changeNib();
  }
}