 import java.util.concurrent.ExecutorService;
 import java.util.concurrent.Executors;
 
 class WorkerThread implements Runnable{
    private String message;

    public WorkerThread(String s){
        this.message = s;
    }

    private void processMessage(){
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void run(){
        System.out.println(Thread.currentThread().getName()+" (start) message= "+message);

        processMessage();
        System.out.println(Thread.currentThread().getName()+" (End)");
    }
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);

        for (int i = 1; i <= 5; i++) {
            Runnable task = new WorkerThread("Task " + i);
            executor.execute(task);
        }
        executor.shutdown();
    }
}
