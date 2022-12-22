package com.company;

import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner str = new Scanner(System.in);
        String Name;
        System.out.print("Введите номер вашего телефона: ");
        long Number = scan.nextLong();
        System.out.print("Введите модель вашего телефона: ");
        String Model = str.nextLine();
        System.out.print("Введите вес вашего телефона: ");
        double weight = scan.nextDouble();
        Phone Phone1 = new Phone(Number, Model, weight);
        System.out.print("Введите действие, которое хотите выполнить (Звонок, Сообщение): ");
        String Choice = str.nextLine();
        switch (Choice){
            case ("Звонок"):
                System.out.print("Введите имя звонящего: ");
                Name = str.nextLine();
                Phone1.receiveCall(Name);
                break;
            case ("Сообщение"):
                System.out.println("Вводите номера, куда хотите послать сообщение. Для завершения ввода введите 0 ");
                int i = 0;
                Number = scan.nextInt();
                Vector v = new Vector(1);
                while (Number != 0 ){
                    i++;
                    System.out.print("Введите номер"+ i +": ");
                    v.addElement(Number);
                    Number = scan.nextInt();
                }
                Phone1.sendMessage(v);
                break;
        }

    }
}