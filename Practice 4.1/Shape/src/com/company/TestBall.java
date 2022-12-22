package com.company;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(5 , 6);
        Ball ball_without_arg = new Ball();
        System.out.println(ball_without_arg);
        ball_without_arg.move(5.7, 6.8);
        ball.setXYSpeed(10);
        System.out.println(ball_without_arg);
        System.out.println("Speed of first ball: " + ball.getXYSpeed());
    }
}