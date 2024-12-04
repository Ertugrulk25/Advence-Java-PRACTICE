package threads_.multithreading_;

public class MultiThreading {
    public static void main(String[] args) {
// iki farklı görev tanımlıyoruz.
MyTask task1 = new MyTask("Görev 1");
MyTask task2 = new MyTask("Görev 2");
//
////iş parçacığı oluştur
Thread thread1 = new Thread(task1);
Thread thread2 = new Thread(task2);
//
////başlat
thread1.start();
thread2.start();
//--------------------------


    }


}
class MyTask implements Runnable {

    private String taskName;

    public MyTask(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        for (int i = 1; i < 5; i++) {
            System.out.println(taskName + "- Adım" + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(taskName + " tamamlandı");


//------- Görev Sınıfını Tanımla ----------
// Aşama aşama multiThread oluşturma
//1-Runnable arayüzünü uygulayan bir sınıf oluştur.
//2-taskName adında  bir değişken tanımla
//3- Consturctor oluştur.
//--------- Görevin Çalıima Mantığını Tanımla -----------
//MyTask classında run methodunu override et
//run() methodu içinde :
//        1'den 5'e kadar bir döngü başlat
// Sleep yaz farkı görmek için
////try catch'e al
//Değişkeni sout ile yazdır.
//Sonra main'e git,
//Obje oluştur
//Thread oluştur.
//Start ile çalıştır.
    }

}