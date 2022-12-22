package pract13_5;

import java.util.Scanner;

public class main {
    public main(){
    }
    public String numberplus(String num){
        StringBuilder s = new StringBuilder(num);
        String coden = "";
        if (s.charAt(0) == '8'){
            coden = "+7";
        } if (s.charAt(0) =='+')
            coden = '+' + s.substring(1,s.length()-10);
        return ('\n' + "Введенный номер: " + coden + s.substring(s.length()-10,s.length()-7) + "-"+s.substring(s.length()-7,s.length()-4) +"-"+ s.substring(s.length()-4,s.length()));
    }


    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        main phone = new main();
        System.out.println(phone.numberplus(str.nextLine()));
    }
}
