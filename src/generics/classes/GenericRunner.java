package generics.classes;

public class GenericRunner {
    public static void main(String[] args) {

GenericProduct<String> massage = new GenericProduct<>("Hello Sofia your salary: ");
        System.out.print(massage.getValue());

        massage.setValue(" ");
        System.out.println(massage.getValue());

//String str = massage.getValue();
//        System.out.println(massage.getValue());

GenericProduct<Integer> salary = new GenericProduct<>(200);
        System.out.print(salary.getValue());

//        salary.setValue(0);
//Integer integer = salary.getValue();
//        System.out.println(salary.getValue());


    }
}
