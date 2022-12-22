package pract13_2;

public class Person {
    public String printName(String surn, String name, String secname)
    {
        if(name == ""|| secname == "")
        {
            System.out.print("Имя или отчество не было введено.");
            return "";
        }
        else
            return "Вывод: " + surn + " " + name + ". " + secname + ". ";
    }
}
