package pract10;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Market {
    private ArrayList<Computer> arr = new ArrayList<>();

    public Computer getComputer(Vendor vendor){
        Computer temp = new Computer();
        System.out.print("Введите название компьютера от "+ vendor.toString()+": ");
        Scanner scanner = new Scanner(System.in);
        temp.setVendor(vendor);
        temp.setName(scanner.nextLine());
        System.out.print("Введите название памяти: ");
        Memory mem = new Memory(scanner.nextLine());
        temp.setMemory(mem);
        System.out.print("Введите название монитора: ");
        Monitor mon = new Monitor(scanner.nextLine());
        temp.setMonitor(mon);
        System.out.print("Введите название процессора: ");
        Processor cpu = new Processor(scanner.nextLine());
        temp.setProcessor(cpu);
        return temp;
    }
    public void addComp(Vendor vendor){
        arr.add(getComputer(vendor));
    }
    public void delComp(String name){
        for (int i = 0; i < arr.size(); i++)
            if (Objects.equals(arr.get(i).getName(), name)) {
                arr.remove(i);
                return;
            }
    }
    public String findComp(String name){
        for (Computer element : arr){
            if (Objects.equals(element.getName(), name)){
                return "Name: " + element.getName() + "\nMemory: "+ element.getMemory() + "\nCPU: "+ element.getProcessor() + "\nMonitor: "+ element.getMonitor()+ "\nVendor: "+ element.getVendor();
            }
        }
        return "Такого компьютера нет!";
    }

}
