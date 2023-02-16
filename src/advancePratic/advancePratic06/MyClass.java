package advancePratic.advancePratic06;

public class MyClass {
    String isim = "Ali Can";
    int yas = 33;
    int kilo = 85;

    MyClass() {
    }

    MyClass(String isim, int yas) {
        this.isim = isim;
        this.yas = yas;
    }

    MyClass(String isim) {
        this.isim = isim;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "isim='" + isim + '\'' +
                ", yas=" + yas +
                ", kilo=" + kilo +
                '}';
    }

    MyClass(String isim, int yas, int kilo) {
        this.isim = isim;
        this.yas = yas;
        this.kilo = kilo;
    }

    public static void main(String[] args) {
        MyClass insan01 = new MyClass("ahmet", 15);
        System.out.println(insan01.isim + "  " + insan01.yas + "  " + insan01.kilo);

        MyClass insan02 = new MyClass("Nalan");
        MyClass insan03 = new MyClass();
        MyClass insan04 = new MyClass("veli",30,68);

        System.out.println(insan02.isim + " " + insan02.yas + " " + insan02.kilo);

        System.out.println(insan03.isim + " " + insan03.yas + " " + insan03.kilo);
        System.out.println(insan04.isim + " " + insan04.yas + " " + insan04.kilo);


      /*  String isim = "Ali Can";
        int yas = 33;
        int kilo = 85;*/






    }
}
