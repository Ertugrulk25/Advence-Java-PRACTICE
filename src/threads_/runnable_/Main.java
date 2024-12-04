package threads_.runnable_;

public class Main{
public static void main(String[] args) {

    /*Açıklama
Yeni Thread Nesnesi Oluşturma: Bu satırlarda Thread sınıfından iki yeni nesne oluşturuluyor:
 thread1 ve thread2. Her iki Thread nesnesine de Runnable arayüzünü implement eden bir nesne
 (runnable) geçiriliyor.
Runnable Nesnesini Thread'e Bağlama: new Thread(runnable); ifadesinde,
Runnable arayüzünü implement eden nesne Thread'in yapıcısına (constructor) geçirilir. Bu şekilde,
 Thread sınıfı bu Runnable nesnesini kullanarak run metodunu çalıştırır.*/

    MyRunnable runnable = new MyRunnable();
    Thread thread1 = new Thread(runnable);
    Thread thread2 = new Thread(runnable);

    thread1.start();
thread1.setName("treat bir");
thread2.start();
    thread2.setName("treat iki");
//    Açıklayalım
//    MyRunnable Sınıfı: Runnable arayüzünü implement eder ve run metodunu override eder.
//    Bu metod, thread’in çalıştığında yapacağı işi içerir.
//    Thread thread1 = new Thread(runnable);: Runnable nesnesi, Thread sınıfına aktarılır.
//    Böylece thread oluşturulmuş olur.
//    thread1.start() ve thread2.start(): Bu metodlar her thread’i başlatır.
//    run metodu içindeki kodlar paralel olarak çalışmaya başlar.
//    Runnable ve Thread Farkı
//    Bu yöntem Thread sınıfını miras almayı gerektirmediğinden, sınıfının başka bir sınıfı
//    miras almasına da imkan tanır. Ayrıca, aynı Runnable nesnesi birden fazla Thread nesnesine
//    atanabilir, yani tek bir Runnable kodu ile birden çok thread başlatmak mümkündür.

}
}
