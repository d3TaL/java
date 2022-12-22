package pract14_4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.compile;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = input.nextLine();
        Pattern ptr = Pattern.compile("\\d+\\s*\\+");
        Matcher m = ptr.matcher(str);
        System.out.print(m.find()?"Верно":"Неверно");
    }
}
