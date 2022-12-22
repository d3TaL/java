package practice10;

public class Student{
    private int idNumber;
    private String Name;
    private String SurName;
    private String Proff;
    private int Cource;
    private String Group;

    private int GPA;
    public int getGPA(){ return GPA; }
    public int getIdNumber() { return idNumber; }

    public String getName() {
        return Name;
    }

    public String getSurName() {
        return SurName;
    }

    public String getProff() {
        return Proff;
    }

    public void setCource(int cource) {
        Cource = cource;
    }

    public void setGPA(int GPA) {
        this.GPA = GPA;
    }

    public String getGroup() {
        return Group;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setSurName(String surName) {
        SurName = surName;
    }

    public void setProff(String proff) {
        Proff = proff;
    }

    public int getCource() {
        return Cource;
    }

    public void setGroup(String group) {
        Group = group;
    }

    public Student() {

    }

    public Student(String name, String Sname) {
        this.Name = name;
        this.SurName = Sname;
    }

    @Override
    public String toString() {
        return String.valueOf(GPA);
    }


}