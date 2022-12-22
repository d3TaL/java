package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите количество километров: ");
        int km = scan.nextInt();
        Auto Opel = new Auto(km);
        Airplane Boieng777 = new Airplane(km);
        Ship Veselaya = new Ship(km);
        Train train = new Train(km);
        System.out.println(Opel);
        System.out.println(Boieng777);
        System.out.println(Veselaya);
        System.out.println(train);
    }
}