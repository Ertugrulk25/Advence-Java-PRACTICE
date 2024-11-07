package generics.interfaceses;

public class GenericInterfaceImpl<T> implements GenericInterface<T>{

    private T product;
    //// Değeri saklamak için bir alan


    public GenericInterfaceImpl(T value) {
        this.product = value;
    }

    @Override
    public void addProduct(T product) {
        System.out.println("Değer: " + product);
    }

    @Override
    public T getProduct(int index) {
        return product;
    }
}
