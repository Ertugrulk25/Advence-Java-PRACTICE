package generics.classes;

public class GenericClassTwoParam <T,U> {

private T name ;
private U number;

public GenericClassTwoParam(T name,U number){

    this.name = name;
    this.number= number;

}

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public U getNumber() {
        return number;
    }

    public void setNumber(U number) {
        this.number = number;
    }
}
