package com.company;

public abstract class Shape{
    protected String color;
    protected boolean filled;

    Shape(){}
    Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    abstract double getArea();
    abstract double getPerimeter();
    @Override
    public String toString(){
        return "Color of this shape: " + color + "\nThis shape is filled? :"+filled;
    }
}
class Rectangle extends Shape {
    protected double width;
    protected double length;

    Rectangle(){}

    Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    Rectangle(double width, double length, String color, boolean filled){
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea(){return length*width;}
    public double getPerimeter(){return length+width;}

    public String toString(){
        return "Length of this shape = " + length + "\nWidth of this shape = " + width;
    }
}

class Square extends Rectangle{

    Square(){};
    Square(double side){
        this.width = this.length = side;
    }
    Square(double side, String color, boolean Filled){
        this.width = this.length = side;
        this.color = color;
        this.filled = Filled;
    }

    public double getSide() {
        return width;
    }

    public void setSide(double side) {
        this.width = this.length = side;
    }

    @Override
    public String toString(){
        return "Side of this Square = " + length;
    }
}

class Circle extends Shape{

    protected double radius;
    Circle(){};
    Circle(double radius){
        this.radius = radius;
    }
    Circle(double radius, String color, boolean Filled){
        this.radius = radius;
        this.color = color;
        this.filled = Filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return 3.14*radius*radius;
    }
    public double getPerimeter(){
        return 2*radius*3.14;
    }

    @Override
    public String toString(){
        return "Radius of this Circle = " + radius;
    }
}
