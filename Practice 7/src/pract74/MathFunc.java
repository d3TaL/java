package pract74;

public class MathFunc implements MathCalculable{
    public void CircleSquare(double R){
        System.out.println(Pi()*R*R);
    }

    public void ComplexMod(double a, double b){
        System.out.println("Module " + a + " + " + b + "i = "+ complexModul(a,b));
    }

    public static void main(String[] args) {
        MathFunc calc = new MathFunc();
        calc.CircleSquare(2);
        calc.ComplexMod(2,3);
    }
}
