package pract10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Market DNS = new Market();
        Scanner input = new Scanner(System.in);
        Scanner str = new Scanner(System.in);
        while (true) {
            System.out.println("Выберите действия: \n\r1.Добавить компьютер\n\r2.Найти компьютер\n\r3.Удалить компьютер");
            int choice = input.nextInt();
            Vendor vendor = Vendor.Гарнизон;
            switch (choice) {
                case 1: {
                    System.out.println("Выберите изготовителя: 1. Asus\n2.Msi\n3.HP\n4.Lenovo :");
                    int vend = input.nextInt();
                    switch (vend) {
                        case 1:
                            vendor = Vendor.Asus;
                            break;
                        case 2:
                            vendor = Vendor.Msi;
                            break;
                        case 3:
                            vendor = Vendor.HP;
                            break;
                        case 4:
                            vendor = Vendor.Lenovo;
                            break;
                    }
                    DNS.addComp(vendor);
                    break;
                }
                case 2: {
                    System.out.print("Введите название компьютера: ");
                    System.out.println(DNS.findComp(str.nextLine()));
                    break;
                }
                case 3: {
                    System.out.print("Введите название компьютера: ");
                    DNS.delComp(str.nextLine());
                    break;
                }
            }
            System.out.println("\n\n");
        }
    }
}
