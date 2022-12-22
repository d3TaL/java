package practice10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class SortingStudentsByGPA implements Comparator<Student> {

    ArrayList<Student> iDNumber = new ArrayList<>();
    ArrayList<Student> iDNumber2 = new ArrayList<>();
    public void setiDNumber(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество студентов: ");
        int n = in.nextInt();
        Scanner str = new Scanner(System.in);
        for (int i = 0; i < n; i++){
            Student temp = new Student();
//            System.out.print("Введите имя студента: ");
//            temp.setName(str.nextLine());
//            System.out.print("Введите фамилию студента: ");
//            temp.setSurName(str.nextLine());
//            System.out.print("Введите группу студента: ");
//            temp.setGroup(str.nextLine());
//            System.out.print("Введите курс студента: ");
//            temp.setCource(in.nextInt());
            System.out.print("Введите итоговый балл студента: ");
            temp.setGPA(in.nextInt());
            iDNumber.add(temp);
            System.out.println();
        }
    }

    public void setiDNumber2(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество студентов: ");
        int n = in.nextInt();
        Scanner str = new Scanner(System.in);
        for (int i = 0; i < n; i++){
            Student temp = new Student();
//            System.out.print("Введите имя студента: ");
//            temp.setName(str.nextLine());
//            System.out.print("Введите фамилию студента: ");
//            temp.setSurName(str.nextLine());
//            System.out.print("Введите группу студента: ");
//            temp.setGroup(str.nextLine());
//            System.out.print("Введите курс студента: ");
//            temp.setCource(in.nextInt());
            System.out.print("Введите итоговый балл студента: ");
            temp.setGPA(in.nextInt());
            iDNumber2.add(temp);
            System.out.println();
        }
    }

    @Override
    public int compare(Student el1, Student el2) {
        if(el1.getGPA()==el2.getGPA())
            return 0;
        else if(el1.getGPA()>el2.getGPA())
            return 1;
        else
            return -1;
    }

    public void quickSortGPA(){
        Student [] temp = new Student[iDNumber.size()];
        for (int i = 0; i < temp.length; i++)
            temp[i] = iDNumber.get(i);
        temp = quickSort(temp, 0, temp.length -1);
        for (int i = 0; i < temp.length; i++){
            iDNumber.set(i, temp[i]);
        }
    }
    public void printMas(){
        for (int i = 0; i < iDNumber.size(); i++){
            System.out.print(iDNumber.get(i).getGPA() + " ");
        }
    }
    public static Student[] quickSort(Student[] students, int leftBorder, int rightBorder) {
        Student[]  t = new Student[0];

        if (students.length == 0)
            return t;

        if (leftBorder >= rightBorder)
            return t;

        // выбрать опорный элемент
        int middle = leftBorder + (rightBorder - leftBorder) / 2;
        Student opora = students[middle];

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = leftBorder, j = rightBorder;
        do {
            while (students[i].getGPA() > opora.getGPA()) {
                i++;
            }

            while (students[j].getGPA() < opora.getGPA()) {
                j--;
            }

            if (i <= j) {//меняем местами
                if (i < j) {
                    Student temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
                i++;
                j--;
            }

        }while (i <= j);

        // вызов рекурсии для сортировки левой и правой части
        if (leftBorder < j)
            students = quickSort(students, leftBorder, j);

        if (rightBorder > i)
            students = quickSort(students, i, rightBorder);
        return students;
    }
    public static Student[] quickSortCource(Student[] students, int leftBorder, int rightBorder) {
        Student[]  t = new Student[0];

        if (students.length == 0)
            return t;

        if (leftBorder >= rightBorder)
            return t;

        // выбрать опорный элемент
        int middle = leftBorder + (rightBorder - leftBorder) / 2;
        Student opora = students[middle];

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = leftBorder, j = rightBorder;
        do {
            while (students[i].getCource() > opora.getCource()) {
                i++;
            }

            while (students[j].getCource() < opora.getCource()) {
                j--;
            }

            if (i <= j) {//меняем местами
                if (i < j) {
                    Student temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
                i++;
                j--;
            }

        }while (i <= j);

        // вызов рекурсии для сортировки левой и правой части
        if (leftBorder < j)
            students = quickSort(students, leftBorder, j);

        if (rightBorder > i)
            students = quickSort(students, i, rightBorder);
        return students;
    }

    public Student[] merge (Student [] s1, Student [] s2){
        Student[] mergemas = new Student[s1.length + s2.length];
        int count = 0;
        for (int i = 0; i < s1.length; i++){
            count = i;
            mergemas[i] = s1[i];
        }
        count +=1;
        for (int i = 0; i < s2.length; i++){
            mergemas[i+count] = s2[i];
        }

        return quickSort(mergemas, 0, mergemas.length -1);
    }
    public void mergeStud(){
        Student [] temp = new Student[iDNumber.size() + iDNumber2.size()];
        for (int i = 0; i < iDNumber.size(); i++){
            temp[i] = iDNumber.get(i);}
        for (int i = 0; i < iDNumber2.size(); i++){
            temp[iDNumber.size()+i] = iDNumber2.get(i);}
       temp = quickSort(temp, 0, temp.length -1);
        for (int i = 0; i < iDNumber.size(); i++){
            iDNumber.set(i, temp[i]);
        }
        int t = iDNumber.size();
        for (int i = 0; i < iDNumber2.size(); i++){
            iDNumber.add(temp[t+i]);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        SortingStudentsByGPA s = new SortingStudentsByGPA();
        s.setiDNumber();
        s.quickSortGPA();
        s.printMas();
        s.setiDNumber2();
        s.mergeStud();
        s.quickSortGPA();
        s.printMas();
    }

}