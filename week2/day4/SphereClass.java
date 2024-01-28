class Sphere{
    int radius;
  
    public void setRadius(int radius){
      this.radius = radius;
    }
  
    public int getRadius(){
      return radius;
    }
  
    public double getVolume(){
      return (4.0/3.0)*Math.PI*Math.pow(radius, 3);
    }
  
    public double getSurfaceArea(){
      return 4*Math.PI*Math.pow(radius, 2);
    }
  }
  
  class SphereClass{
    public static void main(String[] args){
      Sphere sphere1 = new Sphere();
      sphere1.setRadius(5);
      System.out.println("The volume of the sphere is: " + sphere1.getVolume());
      System.out.println("The surface area of the sphere is: " + sphere1.getSurfaceArea());
    }
  }