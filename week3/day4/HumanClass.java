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

class HumanClass{
  public static void main(String[] args){
    Human human = new Human();
    human.jump();
    human.bite();
    human.speak();
    human.eat();
    human.sleep();
  }
}