import java.util.Scanner;

public class TestBall {
    public static void main(String[] args) {
        Ball Ball_without_arg = new Ball();
        Ball Ball_with_clr_and_dim = new Ball("White" , 100);
        Ball Ball_with_mat_and_dim = new Ball("Leather" , 100);
        Ball Ball_with_arg = new Ball("Red" , 5, "Steel");
        Ball_without_arg.setDiameter(7);
        System.out.println(Ball_with_arg);
        System.out.println(Ball_without_arg.getDiameter());
    }
}