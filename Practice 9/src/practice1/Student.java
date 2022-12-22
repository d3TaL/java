package practice1;

public class Student{
    private int idNumber;
    private int GPA;
    public int getGPA(){ return GPA; }
    public int getIdNumber() { return idNumber; }

    public Student(int idNumber) {
        this.idNumber = idNumber;
    }

    public Student(int idNumber, int GPA) {
        this.idNumber = idNumber;
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return String.valueOf(idNumber);
    }

     static Student [] sort(Student[] students){
         int j;
         for (int i = 0; i < students.length; i++) {
             Student swap = students[i];
             for (j = i; j > 0 && swap.getGPA() < students[j-1].getGPA(); j--) {
                 //элементы отсортированного сегмента перемещаем вперёд, если они больше элемента для вставки
                 students[j] = students[j - 1];
             }
             students[j] = swap;
         }
         return students;
     }

    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student(1);
        students[1] = new Student(10);
        students[2] = new Student(5);
        students[3] = new Student(3);
        students[4] = new Student( 2);
        students = sort(students);
        for(Student s : students){
            System.out.println(s);
        }
    }

}