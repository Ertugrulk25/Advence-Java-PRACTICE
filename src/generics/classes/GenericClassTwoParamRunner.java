package generics.classes;

public class GenericClassTwoParamRunner {
    public static void main(String[] args) {


        GenericClassTwoParam<String,Integer> schoolID = new GenericClassTwoParam<>("Ali",126);
        System.out.println("İsim: "+ schoolID.getName());
        System.out.println("No: "+schoolID.getNumber());

    }
}
