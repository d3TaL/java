package pract11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите температуру в Цельсиях: ");
        double Temp = input.nextDouble();
        System.out.println("В Фаренгейтах это: " + new CelsToFareng().convert(Temp));
        System.out.print("В Кельвинах это: " + new CelsToKelv().convert(Temp));

    }
}
