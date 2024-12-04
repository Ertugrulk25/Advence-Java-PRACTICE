package threads_.multithreading_;

public class WaitInterrupt {

public static int balance = 0;

//para yatıma

    public synchronized void depozıt(int amount){

        System.out.println(Thread.currentThread().getName()+ " para yatırmak istiyor...");
        balance = balance + amount;
        System.out.println(" para yatırmaişlemi başarılı "+ balance);

    }
    public synchronized void withDraw(int amount){
        System.out.println(Thread.currentThread().getName()+ " para çekmek istiyor...");

       // bakiye yetersiz ise

        if (balance==0 || amount>balance) {

            System.out.println("Bakiye yetersiz!!! Mevcut bakiye: " + balance);
            // işlem devam edemez bekle
            System.out.println("Bakiyenin güncellenmesini bekleyiniz...");

            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Cihacza farklı bir yerden giriş gerçekleşti ve güncelleme gerçekleştiriliyor...");
            }
        }
        //bakiye güncelleme
        //bakiye yeterli ise

        if (balance>amount){
            System.out.println("Bkiye yeterli , işlem gerçekleştiriliyor...");
            balance= balance-amount;
            System.out.println("Para çekme işlemi başarılı: "+ balance);

        }
    }

    public static void main(String[] args) {
        WaitNotify obj = new WaitNotify();
        //Thread oluştur

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                obj.withDraw(1000);

            }
        });
        thread1.setName("Ali Can");

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                obj.depozit(2000);
                thread1.interrupt();
            }
        });

        thread2.setName("Veli Han");//üretici

        thread1.start();
        thread2.start();
    }
}

