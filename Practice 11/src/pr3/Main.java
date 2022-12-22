package pr3;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner integ = new Scanner(System.in);
        Scanner str = new Scanner(System.in);
        System.out.print("Введите имя студента: ");
        String name = str.nextLine();
        System.out.print("Введите фамилию студента: ");
        String sname = str.nextLine();
        Calendar cal = new GregorianCalendar();

        System.out.print("Введите год рождения: ");
        cal.set(Calendar.YEAR, integ.nextInt());
        System.out.print("Введите месяц рождения: ");
        cal.set(Calendar.MONTH, integ.nextInt()-1);
        System.out.print("Введите день рождения: ");
        cal.set(Calendar.DAY_OF_MONTH, integ.nextInt());
        Date calDate = cal.getTime();

        Student st = new Student(name, sname, calDate);

        System.out.println(st);
    }
}
