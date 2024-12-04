package threads_.extend;

public class MyThread extends Thread {
    //Örnek olarak, bir thread'in 1'den 5'e kadar sayıları ekrana yazmasını sağlayalım:

    @Override
    public void run() {
        for (int i = 1; i < 6; i++) {
            System.out.println(i + " " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("MyThread thread'ı çalışıyor HARİKA!");
            }


        }

    }


}
