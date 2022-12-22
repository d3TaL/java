package pract11;

public class CelsToKelv implements Convertable{

    private double K = 274.15;
    @Override
    public double convert(double element) {
        return element + K;
    }
}
