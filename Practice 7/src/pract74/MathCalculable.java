package pract74;

public interface MathCalculable {
    public default double Pi(){
        return Math.PI;
    }

    public default double pow(double a, double b) {
        double temp = a;
        for (int i = 0; i < b; i++)
            a *= temp;

        return a;
    }
    public default double complexModul(double a, double b) {
        return Math.sqrt(a*a + b*b);
    }
}
