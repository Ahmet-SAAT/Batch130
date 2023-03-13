package advanceJava.Enums;

public enum TransectionTypeEnum {
    DEPOSIT(1),
    WITDRAW(2),
    TRANSFER(3),
    PAYMENT(4),
    OTHER(5);
    private final int code;

    TransectionTypeEnum(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
