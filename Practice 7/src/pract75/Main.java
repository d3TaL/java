package pract75;

import java.util.Scanner;

public class Main implements StringInterface{
    public static void main(String[] args) {
        StringInterface interf = new Main();
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(interf.invert(str));
        System.out.println(interf.counter(str));
        System.out.println(interf.nechet(str));
    }
}
