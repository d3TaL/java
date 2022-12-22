package parct6;

public class Shop implements Printable {
    private String name;

    Shop(String name){ this.name = name;}

    String getName(){ return name;}

    public void print() { System.out.printf("Журнал '%s'\n", name); }
}
