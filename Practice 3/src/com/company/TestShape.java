package com.company;

public class TestShape {
    public static void main(String[] args) {
        Circle Ball = new Circle(3,"Blue",true);
        System.out.println(Ball);
        System.out.println(Ball.getPerimeter());
        Square x2 = new Square(2);
        System.out.println(x2);
    }
}
