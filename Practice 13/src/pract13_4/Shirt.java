package pract13_4;

public class Shirt {
    private String id;
    private String name;
    private String color;
    private String size;

    public void getCharacter(String input){
        String[] data = input.split(",");
        id = data[0];
        name  = data[1];
        color = data[2];
        size = data[3];
    }

    public String toString(){
        return "Идентификационный номер: " + id + "\nНазвание: "+name + "\nЦвет вещи: "+color + "\nРазмер: "+size;
    }

    public static void main(String[] args) {
        Shirt[] mas = new Shirt[11];
        String[] shirts = new String[11];
        shirts[0] = "S001,Black Polo Shirt,Black,XL";
        shirts[1] = "S002,Black Polo Shirt,Black,L";
        shirts[2] = "S003,Blue Polo Shirt,Blue,XL";
        shirts[3] = "S004,Blue Polo Shirt,Blue,M";
        shirts[4] = "S005,Tan Polo Shirt,Tan,XL";
        shirts[5] = "S006,Black T-Shirt,Black,XL";
        shirts[6] = "S007,White T-Shirt,White,XL";
        shirts[7] = "S008,White T-Shirt,White,L";
        shirts[8] = "S009,Green T-Shirt,Green,S";
        shirts[9] = "S010,Orange T-Shirt,Orange,S";
        shirts[10] = "S011,Maroon Polo Shirt,Maroon,S";
        for (int i = 0; i < 11; i++){
            mas[i] = new Shirt();
            mas[i].getCharacter(shirts[i]);
        }
        for (int i = 0; i < 11; i++)
            System.out.println(mas[i].toString());
    }
}
