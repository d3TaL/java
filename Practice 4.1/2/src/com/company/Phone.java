package com.company;

import java.util.Vector;

public class Phone {
    private long number;
    private String model;
    private double weight;

    Phone (long number, String model, double weight){
        this(number, model);
        this.weight = weight;
    }
    Phone (long number, String model){
        this.model = model;
        this.number = number;
    }

    Phone (){
        this.model = "Phone";
        this.number = 0;
        this.weight = 0.0;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public long getNumber() {
        return number;
    }

    public double getWeight() {
        return weight;
    }

    public String getModel() {
        return model;
    }

    public void receiveCall (String Name){
        System.out.println("Звонит " + Name);
    }
    public void receiveCall (String Name, long number){
        System.out.println("Звонит " + Name +", номер: "+number);
    }

    public void sendMessage(Vector numbers){
        for (int i = 0; i< numbers.size(); i++){
            System.out.println(numbers.elementAt(i));
        }
    }
}
