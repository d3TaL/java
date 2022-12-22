package pr3;

import java.util.Date;

public class Student{
    private int idNumber;
    private String Name;
    private String SurName;
    private String Proff;
    private int Cource;
    private String Group;

    private Date biday;
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
        this.biday = new Date();
    }

    public Student(String name, String Sname, Date biday) {
        this.Name = name;
        this.SurName = Sname;
        this.biday = biday;
    }

    public Date getBiday() {
        return biday;
    }

    public void setBiday(Date biday) {
        this.biday = biday;
    }

    @Override
    public String toString() {
        return Name + '\n' + biday;
    }
}
