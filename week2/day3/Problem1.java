class Employee{
    int salary;
    String name;
  
    public int getSalary(){
      return salary;
    }
  
    public String getName(){
      return name;
    }
  
    public void setName(String n){
      this.name=n;
    }
  }
  
  class Problem1{
    public static void main(String[] args){
      Employee neela=new Employee();
  
      neela.setName("Neelakandan");
  
      neela.salary=1000;
  
      System.out.println(neela.getSalary());
      System.out.println(neela.getName());
    }
  }