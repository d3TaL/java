package pract13_2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Введите фамилию: ");
        String surname = str.nextLine();
        System.out.print("Введите имя: ");
        String name = str.nextLine();
        System.out.print("Введите отчество: ");
        String secname = str.nextLine();

        if (name == "" || secname == "")
            System.out.println("Имя или отчество не введено!");
        else{
            name = String.valueOf(name.charAt(0));
            secname = String.valueOf(secname.charAt(0));
            Person person = new Person();
            StringBuilder string = new StringBuilder(person.printName(surname, name, secname));
            System.out.println(string);
        }
    }
}
