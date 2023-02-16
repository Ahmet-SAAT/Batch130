package advancePratic.advancePratic06;

public class Car {

    int price = 50;
static int boy=20;
    public Car(int price) {
        this.price = price;
    }

    public static void main(String[] args) {

        Car c2=new Car(25);
        System.out.println(c2.price);
        System.out.println(Car.boy);

    }



}
