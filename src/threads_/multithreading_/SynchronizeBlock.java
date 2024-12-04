package threads_.multithreading_;

public class SynchronizeBlock {
    public static void main(String[] args) {

        Numbers n = new Numbers();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <8 ; i++) {
                  n.printNumber();

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        thread1.setName("Fred");

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <8 ; i++) {

                    n.printNumber();

                    }
                }

        });
        thread2.setName("Barnie");

        thread1.start();
        thread2.start();





    }
}
class Numbers{

    public synchronized void printNumber (){

        for (int i = 1; i <11 ; i++) {

            System.out.println(i + " ");



        }
        System.out.println("------" + Thread.currentThread().getName());





    }




}