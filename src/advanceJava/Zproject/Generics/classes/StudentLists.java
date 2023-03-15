package advanceJava.Zproject.Generics.classes;

public class StudentLists {
    public static void main(String[] args) {
        System.out.println("Java Dersi Vize ve Final Notlari");
        listGrade();
        System.out.println("--------------------------");
        System.out.println("Kutuphane Uyeleri");
        listMemberOfLibrary();
    }

    private static void listGrade() {
        Student<String, Double, Double> std1 = new Student<>("Ahmet", 76.8, 80.0);
        Student<String, Double, Double> std2 = new Student<>("Mehmet", 66.8, 70.0);
        Student<String, Double, Double> std3 = new Student<>("Fatma", 96.8, 85.0);
        System.out.printf("%-10s || %-4s || %-4s %n", std1.getS(), std1.getU(), std1.getV());
        System.out.printf("%-10s || %-4s || %-4s %n", std2.getS(), std2.getU(), std2.getV());
        System.out.printf("%-10s || %-4s || %-4s %n", std3.getS(), std3.getU(), std3.getV());
    }

    private static void listMemberOfLibrary(){
        Student<String,Integer,String> std1=new Student<>("Adam",560,"adam@gmail.com");
        Student<String,Integer,String> std2=new Student<>("Victor",560,"victor@gmail.com");
        Student<String,Integer,String> std3=new Student<>("Merve",560,"merve@gmail.com");
        System.out.printf("%-10s || %-4s || %-4s %n", std1.getS(), std1.getU(), std1.getV());
        System.out.printf("%-10s || %-4s || %-4s %n", std2.getS(), std2.getU(), std2.getV());
        System.out.printf("%-10s || %-4s || %-4s %n", std3.getS(), std3.getU(), std3.getV());
    }



}
