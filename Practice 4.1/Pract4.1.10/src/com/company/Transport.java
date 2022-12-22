package com.company;

import static java.lang.Math.max;

public abstract class Transport {
    protected double speed;

    protected int lenghtofRoad;
    protected int costPeople;
    protected int costBoxes;
}
class Auto extends Transport{
    Auto(int lenghtofRoad){
        this.lenghtofRoad = lenghtofRoad;
        this.speed = 100.0;
        this.costPeople = 4;
        this.costBoxes = 2;
    }
    public void setSpeed(double speed){
        this.speed=speed;
    }
    public void setCostPeople(int costPeople){
        this.costPeople = costPeople;
    }
    public void setCostBoxes(int costBoxes){
        this.costBoxes = costBoxes;
    }
    public double getSpeed(){
        return speed;
    }
    public int getCostPeople(){
        return costPeople;
    }
    public int getCostBoxes(){
        return costBoxes;
    }
    @Override
    public String toString(){
        return "Стоимость провоза одного человека на машине на расстояние "+lenghtofRoad+": "+ costPeople*lenghtofRoad+" рублей\nОдного килограмма: "+costBoxes*lenghtofRoad+" рублей\nИ займет: "+lenghtofRoad/speed+" часов";
    }
}
class Airplane extends Transport{
    Airplane(int lenghtofRoad){
        this.lenghtofRoad = lenghtofRoad;
        this.speed = 500.0;
        this.costPeople = 200;
        this.costBoxes = 250;
    }
    public void setSpeed(double speed){
        this.speed=speed;
    }
    public void setCostPeople(int costPeople){
        this.costPeople = costPeople;
    }
    public void setCostBoxes(int costBoxes){
        this.costBoxes = costBoxes;
    }
    public double getSpeed(){
        return speed;
    }
    public int getCostPeople(){
        return costPeople;
    }
    public int getCostBoxes(){
        return costBoxes;
    }
    @Override
    public String toString(){
        return "Стоимость провоза одного человека на самолете на расстояние "+lenghtofRoad+": "+ costPeople*lenghtofRoad+" рублей\nОдного килограмма: "+costBoxes*lenghtofRoad+" рублей\nИ займет: "+lenghtofRoad/speed+" часов";
    }
}
class Ship extends Transport{
    Ship(int lenghtofRoad){
        this.lenghtofRoad = lenghtofRoad;
        this.speed = 60.0;
        this.costPeople = 30;
        this.costBoxes = 50;
    }
    public void setSpeed(double speed){
        this.speed=speed;
    }
    public void setCostPeople(int costPeople){
        this.costPeople = costPeople;
    }
    public void setCostBoxes(int costBoxes){
        this.costBoxes = costBoxes;
    }
    public double getSpeed(){
        return speed;
    }
    public int getCostPeople(){
        return costPeople;
    }
    public int getCostBoxes(){
        return costBoxes;
    }
    @Override
    public String toString(){
        return "Стоимость провоза одного человека на корабле на расстояние "+lenghtofRoad+": "+ costPeople*lenghtofRoad+" рублей\nОдного килограмма: "+costBoxes*lenghtofRoad+" рублей\nИ займет: "+lenghtofRoad/speed+" часов";
    }
}
class Train extends Transport{
    Train(int lenghtofRoad){
        this.lenghtofRoad = lenghtofRoad;
        this.speed = 200.0;
        this.costPeople = 3;
        this.costBoxes = 1;
    }
    public void setSpeed(double speed){
        this.speed=speed;
    }
    public void setCostPeople(int costPeople){
        this.costPeople = costPeople;
    }
    public void setCostBoxes(int costBoxes){
        this.costBoxes = costBoxes;
    }
    public double getSpeed(){
        return speed;
    }
    public int getCostPeople(){
        return costPeople;
    }
    public int getCostBoxes(){
        return costBoxes;
    }
    @Override
    public String toString(){
        return "Стоимость провоза одного человека на поезде на расстояние "+lenghtofRoad+": "+ costPeople*lenghtofRoad+" рублей\nОдного килограмма: "+costBoxes*lenghtofRoad+" рублей\nИ займет: "+lenghtofRoad/speed+" часов";
    }
}
