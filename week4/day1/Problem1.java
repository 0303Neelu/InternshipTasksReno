class Th1 extends Thread{
    public void run(){
        while(true){
            System.out.println("good morning");
        }
    }
}

class Th2 extends Thread{
    public void run(){
        while(true){
            System.out.println("welcome");
        }
    }
}

public class Problem1{
    public static void main(String[] args) {
        Th1 t1=new Th1();
        Th2 t2=new Th2();
        t1.start();
        t2.start();
    }
}