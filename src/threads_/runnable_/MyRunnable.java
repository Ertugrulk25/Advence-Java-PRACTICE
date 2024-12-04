package threads_.runnable_;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <6 ; i++) {
            System.out.println(i +" "+ Thread.currentThread().getName());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread kesintiye uğradı");
            }
        }

    }
}
