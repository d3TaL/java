package practice1;
public class Main {
    public static void main(String[] args) {
        Student[] students1 = new Student[5];
        students1[0] = new Student(1, 1);
        students1[1] = new Student(10, 10);
        students1[2] = new Student(5, 5);
        students1[3] = new Student(3, 3);
        students1[4] = new Student( 2 , 2);

        Student[] students2 = new Student[5];
        students2[0] = new Student(345, 345);
        students2[1] = new Student(10 , 10);
        students2[2] = new Student(53, 53);
        students2[3] = new Student(2,  2);
        students2[4] = new Student( 43 , 43);

        MergeStud merg= new MergeStud();
        Student[] res = merg.merge(students1, students2);
        for(Student s : res){
            System.out.println(s);
        }
    }
}