package parct6;

public class Main {
    private static Printable[] ArrayP = new Printable[]
            {
                    new Shop("Журнал 1"),
                    new Book("Война и мир", "Л. Толстой", 1863),
                    new Shop("Игромания"),
                    new Book("Волшебник изумрудного города", "А. Волков", 1959),
                    new Shop("iXBT"),
                    new Book("A byte of Python", "Swaroop C H", 2020)
            };
    public static void main(String[] args) {
        for (Printable element : ArrayP){
            element.print();
        };
    }
}
