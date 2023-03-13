package advanceJava.Enums;

public class Main {
    public static void main(String[] args) {
        useNonEnumVariable(10);
        useNonEnumVariable(20);
        useNonEnumVariable(30);
        useNonEnumVariable(40);
        useNonEnumVariable(50);
        useNonEnumVariable(60);//CTE almam lazim ama vermiyor



        useEnumType(TransectionTypeEnum.DEPOSIT);
        useEnumType(TransectionTypeEnum.WITHDRAW);
        useEnumType(TransectionTypeEnum.TRANSFER);
        useEnumType(TransectionTypeEnum.PAYMENT);
        useEnumType(TransectionTypeEnum.OTHER);
        //useEnumType(TransectionTypeEnum.);//enumtype secenek disinda deger girilmesine musade etmiyor cte veriyor

    }

    public static void useNonEnumVariable(int n) {
        if (n == TransectionTypeConstant.DEPOSIT) {
            System.out.println("Hesaba Para yatiriliyor");
        } else if (n == TransectionTypeConstant.WITHDRAW) {
            System.out.println("Para Cekiliyor");
        } else if (n == TransectionTypeConstant.TRANSFER) {
            System.out.println("Para Transfer ediliyor");
        } else if (n == TransectionTypeConstant.PAYMENT) {
            System.out.println("Odeme gerceklesiyor");
        } else if (n == TransectionTypeConstant.OTHER) {
            System.out.println("Diger Islemler");
        }
    }

    public static void useEnumType(TransectionTypeEnum transectionTypeEnum){
      //  if (transectionTypeEnum.getCode()==10){
      //  System.out.println("DEPOSIT");  } //numara ile de yapabiliriz
      //  if (transectionTypeEnum.ordinal()==0){
      //      System.out.println("DEPOSIT")} //boyle de olur ama enumlarda guncelleme olursa sorun olur

        if (transectionTypeEnum == TransectionTypeEnum.DEPOSIT) {
            System.out.println("Hesaba Para yatiriliyor");
        } else if (transectionTypeEnum == TransectionTypeEnum.WITHDRAW) {
            System.out.println("Para Cekiliyor");
        } else if (transectionTypeEnum == TransectionTypeEnum.TRANSFER) {
            System.out.println("Para Transfer ediliyor");
        } else if (transectionTypeEnum == TransectionTypeEnum.PAYMENT) {
            System.out.println("Odeme gerceklesiyor");
        } else if (transectionTypeEnum == TransectionTypeEnum.OTHER) {
            System.out.println("Diger Islemler");
        }
        System.out.println("Enum name : "+transectionTypeEnum.name());//enumin adini gormek icin
        System.out.println("Enum sirasi : "+transectionTypeEnum.ordinal());
    }

}