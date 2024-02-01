class Circle1{
    public int radius;
  
    Circle1(){
      System.out.println("Non-parameterized constructor of Circle1");
    }
  
    Circle1(int a){
      this.radius=a;
      System.out.println("Parameterized constructor of Circle1");
    }
  
    
  }
  
  class Cylinder1 extends Circle1{
    public int height;
  
    Cylinder1(int r, int h){
      super(r);
      this.height=h;
      System.out.println("Parameterized constructor of Cylinder1");
    }
  
  }
  class Inherit1{
    public static void main(String[] args){
      Cylinder1 cy=new Cylinder1(5,10);
    }
  }