public class ThreadDemo2 extends Thread{
    public void run(){
        System.out.println("Thread is running!");
    }
    public static void main(String[] args) {
        ThreadDemo2 t1 = new ThreadDemo2();
        t1.start();
        t1.start();
    }
}
