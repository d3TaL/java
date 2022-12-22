import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Main {
    public static void recurs(int n, int start){
        if (start == n){
            System.out.print(start + " ");
            return;
        }
        if (start < n) {
            System.out.print(start + " ");
            recurs(n, start + 1);
            return;
        }
        return;
    }
    public static void IntNums(int a, int b){
        if (a == b){
            System.out.println(a);
            return;}
        System.out.print(a + " ");
        if (a > b)
            IntNums(a-1 , b);
        if (a < b)
            IntNums(a+1, b);
        return;
    }

    public static int summator(int k, int s, int size){
        String temp = String.valueOf(k);
        int sum = 0;
        if (temp.length()>size)
            return 0;
        for (int i = 0; i < temp.length(); i++){
            sum += Integer.parseInt(String.valueOf(temp.charAt(i)));
        }
        if (sum == s){
            return (1 + summator(k+1, s, size));
        }
        return (0 + summator(k+1, s, size));
    }

    public static int schet(int num){
        if (num/10 == 0)
            return num%10;
        return (num%10) + schet(num/10);
    }

    public static void main(String[] args) {
        System.out.println("Num2: ");
        recurs(10,1);
        System.out.println("\nNum3: ");
        IntNums(1,10);
        IntNums(10, 1);

        System.out.println("Num4: ");
        int k = 3;
        int s = 10;
        String num = "1";
        for (int i = 1; i < k; i++){
            num += "0";
        }
        System.out.println(summator(Integer.valueOf(num), s, k));

        System.out.println("Num5: ");
        System.out.println(schet(999));
    }
}