package advanceJava.Generics.Bounding;

//Parametre olarak aldigimiz data tipini sinirlandirabiliriz.
//Bu classda sadece Numberin alt classlari kullanilabilsin.Integer.Short,Long,Double,Float,Byte
public class GenericUpperBound<T extends Number> {
    //yani sadece Number classindaki T tipleri olsun diyoruz.
    // Integer.Short,Long,Double,Float,Byte classi usten sinirladik.Usteki siniflara gidemez.Objecte de gidemez.

    private T[] numberArray;//field, ozellik

    public GenericUpperBound(T[] numberArray) {
        this.numberArray = numberArray;
    }

    //array icindeki degerlerin ortalamasini buln method
    public double getAverage() {
        double sum = 0;
        for (T t : this.numberArray) {
            sum += t.doubleValue();
        }
        double avg = sum / this.numberArray.length;
        return avg;
    }

    public static void main(String[] args) {
        Integer [] intarr={2,3,5,99};
        Double [] doublearr={2.3,5.5,88.9};
        String [] stringarr={"Generic","Tipleri","Ustten","Sinirlandirabiliriz"};
        GenericUpperBound<Integer> obj1=new GenericUpperBound<>(intarr);
        System.out.println(obj1.getAverage());
        GenericUpperBound<Double> obj2=new GenericUpperBound<>(doublearr);
        System.out.println(obj2.getAverage());
       // GenericUpperBound<String> obj3=new GenericUpperBound<>(stringarr);//CTE String tipli olmaz cunku number class ile sinirli


    }

}
