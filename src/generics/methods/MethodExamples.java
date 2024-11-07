package generics.methods;

import java.util.Arrays;

public class MethodExamples {
    public static void main(String[] args) {

    String[] names = {"Ali","Veli","Can"};
    Integer[] nums = {2,5,8,9,6,4,2,};
    Double[] doubles = {2.5,5.2,8.2,5.4};
printArray9(names);
printArray9(nums);
printArray9(doubles);
//---------------
   Integer i = printArray10(nums);
        System.out.println(i);

        String s =printFirst(names);
        System.out.println("İsim: "+ s);
//---------------
       printArrayEl(names,5);//Ali Veli Can 5

        //---------------------
        printArrEl(nums,9);//9 5 8 9 6 4 2

    }
public static <T> void  printArray(T[] arr){

}
public static <T> void printArray1(T[] arr1){

}
public static <T> void printArray2(T[] arr2){

}
public static <T> void printArray3(T[] arr3){

}
public static <T> void printArray4(T[] arr4){

}
public static <T> void printArray5(T[] arr5){

}
public static<T> void printArray6(T[] arr6){

}
public static <T> void printArray7(T[] arr7){

}
public static <T> void printArray8 (T[] arr8){

    Arrays.stream(arr8).forEach(t-> System.out.print(t + " "));
}
public static <T> void printArray9(T[] arr9){
    Arrays.stream(arr9).forEach(t-> System.out.print(t + " "));
    System.out.print("/////////////////////////////////////////////////////////////////////////////////////////");
    }
//-----------------------------------
    public static <T> T printArray10(T[] arr10){
   //Bizim seçtiğimizi yazdırı.
        T first = arr10[0];

        return first;
    }

public static <T> T printFirst(T[] arr){
        T first1= arr[2];
        return first1;
}
//----------------------------------
public static <S,U> void printArrayEl(S[] arr,U obj){

        Arrays.stream(arr).forEach(t-> System.out.print(t + " "));
    System.out.println(obj);
}
public static <U,S> void printArr(U[] arr,S obj){


}
//------------------------------------
    public static <S> void printArrEl(S[] arr,S obj){
//yer değiştirme
        arr[0]=obj;
        Arrays.stream(arr).forEach(t-> System.out.print(t + " "));
        System.out.println();

    }
}




















