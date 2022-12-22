package pract14_8;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.compile;

public class Pass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = input.nextLine();
        Pattern patt = Pattern.compile("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z_]{8,}");

        Matcher matt = patt.matcher(str);
        if (matt.find())
            System.out.println("Пароль удовлетворяет нормам безопасности");
        else
            System.out.println("Пароль не удовлетворяет нормам безопасности");
    }

}
