package folder.folderl1.folderl2;

class Calculator{
  public void calculate(int a,int b){
    System.out.println("Addition: "+(a+b));
    System.out.println("Subtraction: "+(a-b));
    System.out.println("Multiplication: "+(a*b));
    System.out.println("Division: "+(a/b));
  }
}

class ScCalculator{
  public void calculate(int a,int b){
    System.out.println("Sin ="+ Math.sin(a+b));
    System.out.println("Cos ="+ Math.cos(a+b));
    System.out.println("Sin ="+ Math.tan(a+b));
  }
}

class HyCalculator{
  public void calculate(int a,int b){
    System.out.println("Addition: "+(a+b));
    System.out.println("Subtraction: "+(a-b));
    System.out.println("Multiplication: "+(a*b));
    System.out.println("Division: "+(a/b));
    System.out.println("Sin ="+ Math.sin(a+b));
    System.out.println("Cos ="+ Math.cos(a+b));
    System.out.println("Sin ="+ Math.tan(a+b));
  }
}

public class CalculatorClass{
  int a=5;
  protected int b=4;
  public static void main(String[] args){
    Calculator c1=new Calculator();
    ScCalculator c2=new ScCalculator();
    HyCalculator c3=new HyCalculator();
    c1.calculate(10,20);
    c2.calculate(10,20);
    c3.calculate(10,20);
  }
}