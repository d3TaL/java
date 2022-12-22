package pract5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите начальные координаты круга: ");
        System.out.print("X: ");
        int x = in.nextInt();
        System.out.print("Y: ");
        int y = in.nextInt();
        System.out.print("Введите скорость точки по X: ");
        int speedX = in.nextInt();
        System.out.print("Введите скорость точки по Y: ");
        int speedY = in.nextInt();
        System.out.print("Введите радиус: ");
        int radius = in.nextInt();
        MovableCircle circle = new MovableCircle(x, y, speedX, speedY, radius);
        circle.moveDown();
        circle.moveLeft();
        System.out.println(circle);
    }
}