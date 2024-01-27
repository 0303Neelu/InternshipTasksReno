class Circle{
    int r;
    public double area(){
      return 3.14*r*r;
    }
  
    public double circumference(){
      return 2*3.14*r;
    }
  }
  
  class Shape{
    public static void main(String[] args){
      System.out.println("Drawing a shape...");
      Circle r=new Circle();
      r.r=5;
      System.out.println(r.area());
      System.out.println(r.circumference());
    }
  }