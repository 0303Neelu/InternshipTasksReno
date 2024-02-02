class Monkey{
  public void jump(){
    System.out.println("Jumping...");
  }
  public void bite(){
    System.out.println("Biting...");
  }
}

interface BasicAnimal{
  void eat();
  void sleep();
}

class Human extends Monkey implements BasicAnimal{
  void speak(){
    System.out.println("Hello Sir!");
  }


  public void eat(){
    System.out.println("Eating...");
  }

  public void sleep(){
    System.out.println("Sleeping...");
  }
}

class Polymorph1{
  public static void main(String[] args){
    Monkey m1=new Human();
    //we can't use m1.speek() because it is not in Monkey class
    m1.jump();
    m1.bite();

    BasicAnimal ba1=new Human();
    ba1.eat();
    ba1.sleep();
    //we can't use ba1.speak() because it is not in BasicAnimal class
  }
}