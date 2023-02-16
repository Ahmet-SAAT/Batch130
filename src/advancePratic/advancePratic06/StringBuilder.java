package advancePratic.advancePratic06;

public class StringBuilder {
    public StringBuilder(String str1) {
    }

    public static void main(String[] args) {
        //Metodlarla orjinal hali degistirmek icin string builder kullaniriz.
        String str = "Ali";
        java.lang.StringBuilder stb = new java.lang.StringBuilder(str);
        System.out.println(stb.reverse());//metodlu
        System.out.println(stb);//metod orjinal stb yi degistirdi
        System.out.println(str);//str orjinal degeri degismedi
       /* if (str.equals(stb)) {
            System.out.println("Palindrome");
        }*/ //Hata vermese bile herzaman false verir.Cunku str string ama stb string degil.Stringbuildirdir.
//ama onu da stringe cevirebiliriz.

        String str1 = "Ahmet";
        java.lang.StringBuilder stbuil = new java.lang.StringBuilder(str1);
        String str2=stbuil.reverse().toString();//Stringbuildeda islem yapip stringe atadim.
        System.out.println(str2);
        if (str1.equals(str2)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Palindrome Degil");
        }


    }//main
}
