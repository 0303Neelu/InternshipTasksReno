class Threads1 extends Thread{
    public void run(){
        while(true){
            System.out.println("good morning");
        }
    }
}

class Threads2 extends Thread{
    public void run(){
        
    }
}

public class Problem4And5{
    public static void main(String[] args) {
        Threads1 t1=new Threads1();
        Threads2 t2=new Threads2();
        t1.setPriority(6);
        t2.setPriority(9);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        //t1.start();
        //t2.start();
        System.out.println(t2.getState());

        t2.start();

        System.out.println(t2.getState());
        System.out.println(Thread.currentThread().getState());
    }
}