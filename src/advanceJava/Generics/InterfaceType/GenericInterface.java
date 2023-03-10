package advanceJava.Generics.InterfaceType;

//exp repository--->customer,user,account,
public interface GenericInterface<T> {
    void printValue(T type);

    T getValue();
}
