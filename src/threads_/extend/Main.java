package threads_.extend;

public class Main {
    public static void main(String[] args) {

        MyThread thread1= new MyThread();
        MyThread thread2 = new MyThread();

        thread1.start();
        thread2.start();
    }
}
//Kısaca Açıklayalım
//run(): Bu metod, thread çalıştığında yapılacak işleri tanımlar. Her thread başladığında run metodundaki kodlar çalıştırılır.
//Thread.sleep(1000): Bu kod, thread’in her adımdan sonra 1 saniye beklemesini sağlar.
//start(): Thread’i başlatır ve run metodundaki işlemlerin yapılmasını sağlar.
// Bu örnekte, iki ayrı thread 1'den 5'e kadar sayıları ekrana yazacaktır. Her ikisi de aynı
// anda çalıştığı için, sonuçlarda farklı sıralamalar görebilirsin.
//Bu örneği çalıştırıp sonuçları inceleyebilirsin!