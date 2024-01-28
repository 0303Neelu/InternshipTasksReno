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

  public double getVolume(){
    return Math.PI * radius * radius * height;
  }

  public double getSurfaceArea(){
    return 2 * Math.PI * radius * (radius + height);
  }
}

class Cylinder2{
  public static void main(String[] args){
    Cylinder c=new Cylinder();
    c.setHeight(10);
    c.setRadius(5);
    System.out.println("Height: "+c.getHeight());
    System.out.println("Radius: "+c.getRadius());
    System.out.println("Volume: "+c.getVolume());
    System.out.println("Surface Area: "+c.getSurfaceArea());
  }
}