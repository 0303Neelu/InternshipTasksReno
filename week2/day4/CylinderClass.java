class Cylinder{
    private int height;
    private int radius;
  
    public int getHeight(){
      return height;
    }
  
    public int getRadius(){
      return radius;
    }
  
    public void setHeight(int height){
      this.height = height;
    }
  
    public void setRadius(int radius){
      this.radius = radius;
    }
  }
  
  class CylinderClass{
    public static void main(String[] args){
      Cylinder c=new Cylinder();
      c.setHeight(10);
      c.setRadius(5);
      System.out.println("Height: "+c.getHeight());
      System.out.println("Radius: "+c.getRadius());
    }
  }