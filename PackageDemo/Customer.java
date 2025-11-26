class TestITC {
    int amount = 10000;

    synchronized void withdraw(int amount){
        System.out.println("Going to Withdraw...");

        if(this.amount < amount){
            System.out.println("Less Balance, Waiting for Deposite...");

            try {
                wait();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        this.amount -= amount;
        System.out.println("Withdrawal Completed...");
    }

    synchronized void deposite(int amount){
        System.out.println("Going To Deposite...");
        this.amount += amount;

        System.out.println("Deposite Completed");
        notify();
    }
}

class Customer{
    public static void main(String[] args) {
        final TestITC c = new TestITC();

        new Thread(){
            public void run(){
                c.withdraw(15000);
            }
        }.start();

        new Thread(){
            public void run(){
                c.deposite(8000);
            }
        }.start();
    }
}
