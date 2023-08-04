class Rational {
    private int numerator;
    private int denominator;

    public Rational() {
        numerator = 0;
        denominator = 1;
    }

    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }

    public Rational add(Rational other) {
        int commonDenominator = denominator * other.denominator;
        int commonNumerator = numerator * other.denominator + other.numerator * denominator;
        return new Rational(commonNumerator, commonDenominator);
    }

    public void show() {
        System.out.println(numerator + "/" + denominator);
    }

    private void simplify() {
        int gcd = gcd(numerator,denominator);
        numerator /= gcd;
        denominator /= gcd;
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
public class Demo {
    public static void main(String[] args) {
        Rational r1 = new Rational(1, 2);
        Rational r2 = new Rational(3, 4);
        Rational sum = r1.add(r2);
        sum.show();
    }
}
