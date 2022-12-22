package pr4;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner integ = new Scanner(System.in);
        Calendar cal = new GregorianCalendar();

        System.out.print("Введите год, месяц, день: ");
        cal.set(Calendar.YEAR, integ.nextInt());
        cal.set(Calendar.MONTH, integ.nextInt()-1);
        cal.set(Calendar.DAY_OF_MONTH, integ.nextInt());
        System.out.print("Введите час, минуты: ");
        cal.set(Calendar.HOUR_OF_DAY, integ.nextInt());
        cal.set(Calendar.MINUTE, integ.nextInt());
        Date calDate = cal.getTime();

        System.out.println(calDate);
    }
}
