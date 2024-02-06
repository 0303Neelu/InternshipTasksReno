class Thread1 extends Thread{
    public void run(){
        while(true){
            System.out.println("good morning");
        }
    }
}

class Thread2 extends Thread{
    public void run(){
        while(true){
            System.out.println("welcome");
        }
    }
}

public class Problem3{
    public static void main(String[] args) {
        Thread1 t1=new Thread1();
        Thread2 t2=new Thread2();
        t1.setPriority(6);
        t2.setPriority(9);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        //t1.start();
        //t2.start();
    }
}