package summation;

public class Number {
    private int value;

    public Number(int value) {
        this.value = value;
    }

    public boolean is_Even() {
        return value % 2 == 0;
    }

    public int getValue() {
        return value;
    }
}