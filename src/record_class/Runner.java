package record_class;

public class Runner {
    public static void main(String[] args) {

        Employee employee = new Employee("Ali","Can",250,2000);
        Employee employee1=new Employee("Veli", "Han",200,2500);
        Employee employee2 = new Employee("Cana","Tan", 224,2700);

        System.out.println(employee);
        System.out.println(employee1);
        System.out.println(employee2);
    }
}
