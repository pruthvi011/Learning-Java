class PrintDetails {

    public static synchronized void printMessage(String s) {

        for (int i = 1; i <= 5; i++) {
            System.out.println(s);

            try {
                Thread.sleep(200);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    class MyThread1 extends Thread {
        String s;

        MyThread1(String s) {
            this.s = s;
        }

        public void run() {
            PrintDetails.printMessage(s);  // Correct way to call static method
        }
    }

}
class StaticSynchro {
        public static void main(String[] args) {

            PrintDetails obj = new PrintDetails();

            PrintDetails.MyThread1 t1 = obj.new MyThread1("Hello");
            PrintDetails.MyThread1 t2 = obj.new MyThread1("Welcome");

            t1.start();
            t2.start();
        }
}
