package pract14_2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class main2 {
    public static boolean isThatStr(String s){
        return s.equals("abcdefghijklmnopqrstuv18340");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = input.nextLine();
        Pattern patt = Pattern.compile("abcdefghijklmnopqrstuv18340");
        Matcher matcher = patt.matcher(str);

        if (matcher.matches())
            System.out.println("Строка верна");
        else
            System.out.println("Строка неверна");
    }
}
