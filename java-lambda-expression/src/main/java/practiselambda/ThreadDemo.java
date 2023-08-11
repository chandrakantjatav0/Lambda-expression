package practiselambda;

public class ThreadDemo {
    public static void main(String[] args) {
        //First Thread : Thread - John
        Runnable thread1 = () -> {
            // this is Body of Thread
            //stuff
            for (int i = 1; i <= 10; i++) {
                System.out.println("Value of i is " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread t = new Thread(thread1);
        t.setName("JOHN");
        t.start();
        Runnable thread2 = () -> {
            try {
                for (int i = 1; i <= 10; i++) {
                    System.out.println(i * 2);
                    Thread.sleep(2000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Thread t2 = new Thread(thread2);
        t2.start();
    }
}
