package generics.methods;

import java.util.Arrays;

public class GenericMethods {

    public static void main(String[] args) {

        Integer[] intArr={2,3,8,99,55};
        Double[] doubleArr={1.3,35.6,99.9,0.5};
        String[] stringArr={"Java","generics","hayatımızı","kolaylaştırır"};





    }
public static <T> void printArrGeneric(T[] arr){
/*Bu metod generic olarak tanımlanmış ve her türdeki diziyi yazdırabiliyor.
 T tür parametresi sayesinde metodu Integer[], String[] ve Double[] gibi farklı türlerle kullanabiliyoruz.
  Bu metod, yukarıdaki printArr metodlarının overloaded versiyonlarından daha esnektir,
   çünkü tüm veri türleriyle çalışabilir.*/
        Arrays.stream(arr).forEach(t-> System.out.println(t + " "));
    System.out.println();


    }
public static <T> T getFirst(T[] arr){
       /*Bu metot, verilen herhangi bir dizinin ilk elemanını döndürmek için generic olarak tanımlanmıştır.
       T tür parametresi, getFirst metodunun dönüş türünü belirler.
       Integer[] gibi bir dizi gönderildiğinde, T otomatik olarak Integer olur ve dönüş tipi de Integer olur.
        Aynı şey String[] gibi farklı diziler için de geçerlidir.
        Bu sayede metodu farklı türde dizilerle çalıştırabiliriz.*/
        T first = arr[0];
        return first;
}
public static <S,U> void printArrAndElement(S[] arr,U obj){

        /*Bu metot iki farklı tür parametresi (S ve U) kullanır. S parametresi dizi türünü temsil ederken,
         U parametresi tek bir objenin türünü temsil eder. Bu metodu çağırdığınızda,
          S ve U türleri çağrı sırasında otomatik olarak belirlenir. Örneğin:

printArrAndElement(stringArr, 5); çağrısında S türü String, U türü ise Integer olur.
printArrAndElement(intArr, "abc"); çağrısında S türü Integer, U türü ise String olur.
Bu yapı, metodun farklı türde diziler ve objelerle esnek bir şekilde çalışmasını sağlar.*/
        Arrays.stream(arr).forEach(t-> System.out.println(t + " " ));
    System.out.println(obj);
    }

    public static <T> void printArrAndElement1(T[] arr, T obj){
       // Bu metodun hem arr hem de obj parametreleri aynı türde (T). Bu sayede, arr[0] = obj;
        // gibi bir atama yapılabiliyor. Çünkü arr ve obj aynı türde. Örneğin,
        // bu metodu printArrAndElement2(intArr, 10); şeklinde çağırırsanız T türü Integer olur ve dizinin
        // ilk elemanını 10 ile güncelleyip diziyi ve objeyi yazdırır.

        arr[0]= obj;
        Arrays.stream(arr).forEach(t -> System.out.println(t + " "));
        System.out.println();

    }


}

