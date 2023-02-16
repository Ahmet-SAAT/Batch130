package advancePratic.advancePratic13.CokluMapAile;

public class MapAile {
    public static void main(String[] args) {
        //Ad-Soyad-Yaş ve kardeşler listesini tek bir Map içerisinde saklayan bir kod yazınız.
        Aile obj1 = new Aile("Ali", "Can", 12, "Ahmet", "Hayriye");
        System.out.println("Ali.getAileMap() = " + obj1.getAileMap());
        Aile obj2=new Aile("Veli","Han",19,"Nur","Hafsa","Kazim","Buse","Selim");
        System.out.println("Veli.getAileMap() = " + obj2.getAileMap());
        Aile obj3=new Aile("Ayse","Kor",30,"Aysun");
        System.out.println("Ayse.getAileMap() = " + obj3.getAileMap());

    }


}
