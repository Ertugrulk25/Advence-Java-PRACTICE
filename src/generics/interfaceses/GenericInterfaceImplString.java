package generics.interfaceses;

import java.util.ArrayList;
import java.util.List;

public class GenericInterfaceImplString implements GenericInterface<String> {

    private List<String> products = new ArrayList<>();



    @Override
    public void addProduct(String product) {

    }

    @Override
    public String getProduct(int index) {
        return "";
    }

    public static void main(String[] args) {

        GenericInterface<String> s = new GenericInterfaceImpl<>("Hello");
        s.addProduct("Halo");

GenericInterface<Integer> i = new GenericInterfaceImpl<>(0);
    i.addProduct(5);

    }
}


