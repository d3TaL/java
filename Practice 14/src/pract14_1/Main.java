package pract14_1;

import java.lang.reflect.Array;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = input.nextLine();
        Pattern patt = Pattern.compile("(([a-zA-Z]+)|([0-9]+))|(([0-9]+)|([a-zA-Z]+))");
        Matcher match = patt.matcher(str);

        ArrayList<Object> items = new ArrayList<>();
        while(match.find())
        {
            items.add(match.group(1));
        }
        System.out.println(items);
    }

}
