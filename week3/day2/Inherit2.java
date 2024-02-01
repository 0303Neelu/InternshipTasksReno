class Rectangle1{
    public int length;
    public int breadth;
  
    Rectangle1(){
      System.out.println("Non-parameterized constructor of Rectangle1");
    }
  
    Rectangle1(int l,int b){
      this.length=l;
      this.breadth=b;
      System.out.println("Parameterized constructor of Rectangle1");
    }
  
    public int area(){
      return this.length*this.breadth;
    }
  }
  
  class Cuboid1 extends Rectangle1{
    public int height;
  
    Cuboid1(int l, int b,int h){
      super(l,b);
      this.height=h;
      System.out.println("Parameterized constructor of Cuboid1");
    }
  
    public int volume(){
      return this.area()*this.height;
    }
  }
  class Inherit2{
    public static void main(String[] args){
      Cuboid1 cy=new Cuboid1(5,10,15);
    }
  }