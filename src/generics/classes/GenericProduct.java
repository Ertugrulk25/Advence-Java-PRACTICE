package generics.classes;

public class GenericProduct <T> {

    private T value;

    public GenericProduct(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
    /*Bu örnekte GenericClass, T türünde bir parametre alır. Bu sayede GenericClass<String>
    ya da GenericClass<Integer> gibi farklı türlerle çalışabiliriz.*/
}
