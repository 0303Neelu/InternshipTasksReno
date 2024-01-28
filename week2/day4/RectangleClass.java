
class Rectangle{
    int height;
    int breadth;
  
    public Rectangle(){
      this.height=4;
      this.breadth=5;
    }
  
    public Rectangle(int height, int breadth){
      this.height=height;
      this.breadth=breadth;
    }
  }
  
  class RectangleClass{
    public static void main(String[] args){
      Rectangle r=new Rectangle();
      System.out.println("Height: "+r.height);
      System.out.println("Breadth: "+r.breadth);
      
    }
  }