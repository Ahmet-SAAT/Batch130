package advanceJava.Generics.classes;


import java.util.ArrayList;
import java.util.List;

//public class clas_name <T,K,N,V>
public class GenericClass <T>{
    private T type;

    public T getType() {
        return type;
    }

    public void setType(T type) {
        this.type = type;
    }
}
