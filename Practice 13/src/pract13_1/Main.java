package pract13_1;

public class Main {
    private String s = "";
    public void str(String in) {
        s = in;
    }
    public String atoo(){
        return s.replace('a', 'o');
    }
    public String Upper(){
        return s.toUpperCase();
    }
    public String Lower(){
        return s.toLowerCase();
    }
    public String cut(){
        return s.substring(7,11);
    }

    public static void main(String[] args) {
        Main m = new Main();
        String s = "I like Java!!!";
        m.str(s);
        System.out.println(s.charAt(s.length()-1));
        System.out.println("Строка заканчивается на !!!: " + (s.endsWith("!!!")? "Да" : "Нет"));
        System.out.println("Строка начинается на I like: " + (s.startsWith("I like")? "Да" : "Нет"));
        System.out.println("Строка содержит Java: " + (s.contains("Java")? "Да" : "Нет"));
        System.out.println(m.atoo());
        System.out.println(m.Upper());
        System.out.println(m.Lower());
        System.out.println(m.cut());
    }
}
