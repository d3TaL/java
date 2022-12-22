package pract11;

public class CelsToFareng implements Convertable {
    private double K = 32;
    @Override
    public double convert(double element) {
        return element*1.8 + K;
    }
}
