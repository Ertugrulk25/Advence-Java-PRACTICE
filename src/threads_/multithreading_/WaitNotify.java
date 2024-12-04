package threads_.multithreading_;

public class WaitNotify {

    public static int balance;

    public synchronized void depozit (int amount){
        System.out.println(Thread.currentThread().getName()+ " Para yatırmak istiyyor...");
        balance= balance+amount;
        System.out.println("Para yatırma işlemi başarılı: "+ balance);
            notify();

    }
public synchronized void withDraw(int amount){
    System.out.println(Thread.currentThread().getName()+ " Para çekmek istiyor...");

    if (balance==0||amount>balance){
        System.out.println("Bakiye yetesiz!!! Mevcut Bakiye " + balance);
        //işlem devam edemez bekleyecek
        System.out.println("Bakineyiniz güncellenmesini bekleyiniz...");

        try {
            wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
        //bakiye güncelleme
    if (balance> amount){
        System.out.println("Bakiye yeterli işlem gerçekleşiyor... ");
   balance = balance - amount;
        System.out.println("Para çekme işlemi başarılı , mevcut bakiye " + balance);
    }
}

    public static void main(String[] args) {
        WaitNotify obj = new WaitNotify();
     //par çekme ve yatırma işlemlerini thread a yaptıracağız.

     Thread thread1 = new Thread(new Runnable() {
         @Override
         public void run() {
             obj.withDraw(1000);//harcama
         }
     });
     thread1.setName("Ali Can");

     Thread thread2 = new Thread(new Runnable() {
         @Override
         public void run() {
             try {
                 Thread.sleep(3000);
             } catch (InterruptedException e) {
                 throw new RuntimeException(e);
             }
             obj.depozit(2000);
         }
     });
     thread2.setName("Veli Han");

     thread1.start();
     thread2.start();
    }


}
