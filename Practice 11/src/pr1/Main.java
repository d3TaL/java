package pr1;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Фамилия разработчика: ");
        Scanner str = new Scanner(System.in);
        String name = str.next();
        Date date = new Date();
        System.out.println("Фамилия разработчика: " + name + "\nДата получения задания: Sun Dec 11 18:48:12 MSK 2022\nДата и время сдачи: " + date);
    }
}