package advanceJava.Generics.InterfaceType;
//Bir class generic interface i implement ederse bu classinda generic olmasi lazim
//Iki clasiinda dat tipleri ayni olmali
public class GenericInterfaveImp <T> implements GenericInterface<T>{
    @Override
    public void printValue(T type) {

    }

    @Override
    public T getValue() {
        return null;
    }
}
