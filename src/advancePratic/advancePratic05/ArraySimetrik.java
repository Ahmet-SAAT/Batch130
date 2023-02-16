package advancePratic.advancePratic05;

public class ArraySimetrik {
    public static void main(String[] args) {
        //Arrayin Simetrik Olup Olmadigini Kontrol Eden Metod Yaz


        int[] brr = {2, 3, 1, 4,0,2, 4, 1, 3, 2};
        issimetrik(brr);


    }//main

    public static boolean issimetrik(int[] arr) {
        boolean issimetrik = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[arr.length - 1 - i]) {
                issimetrik = true;
            } else {
                issimetrik = false;
                break;
            }

        }
        System.out.println(issimetrik);
        return issimetrik;

    }


}
