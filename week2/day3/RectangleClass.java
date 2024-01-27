class Rectangle{
    int length;
    int breadth;
  
    public int area(){
      return length*breadth;
    }
  
    public int perimeter(){
      return 2*(length+breadth);
    }
  }
  
  class RectangleClass{
    public static void main(String[] args){
      Rectangle r=new Rectangle();
  
      r.length=4;
      r.breadth=5;
      System.out.println(r.area());
      System.out.println(r.perimeter());
  
    }
  }