public class DemonThreadDemo extends Thread{
    public void run(){
        if(Thread.currentThread().isDaemon()){
            System.out.println("Daemon Thread Executed....");
        }
        else{
            System.out.println("User Thread Executed....");
        }
        
    }
    public static void main(String[] args) {
        DemonThreadDemo T1 = new DemonThreadDemo();
        DemonThreadDemo T2 = new DemonThreadDemo();
        DemonThreadDemo T3 = new DemonThreadDemo();

        T1.setDaemon(true);

        T2.start();
        T1.start();
        T3.start();

        System.out.println(Thread.currentThread().getName()+ "Ends");
    }
}
