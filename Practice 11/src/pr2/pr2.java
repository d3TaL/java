package pr2;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class pr2 {
    public static void main(String[] args) {
        Scanner integ = new Scanner(System.in);
        Calendar cal = new GregorianCalendar();

        System.out.print("Введите год: ");
        cal.set(Calendar.YEAR, integ.nextInt());
        System.out.print("Введите месяц: ");
        cal.set(Calendar.MONTH, integ.nextInt() -1);
        System.out.print("Введите день: ");
        cal.set(Calendar.DAY_OF_MONTH, integ.nextInt());
        Date calDate = cal.getTime();


        Date Datenow = new Date();

        if (calDate.before(Datenow))
            System.out.println("Дата, которая была введена, раньше текущей.");
        else if (calDate.after(Datenow))
            System.out.println("Дата, которая была введена, позже текущей!");
        else
            System.out.println("Даты совпадают.");
    }
}
