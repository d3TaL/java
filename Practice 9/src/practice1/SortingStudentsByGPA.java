package practice1;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student el1, Student el2) {
        if(el1.getGPA()==el2.getGPA())
            return 0;
        else if(el1.getGPA()>el2.getGPA())
            return 1;
        else
            return -1;
    }

    public static Student[] quickSort(Student[] students, int leftBorder, int rightBorder) {
        Student[] t = new Student[0];
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
            while (students[i].getGPA() < opora.getGPA()) {
                i++;
            }

            while (students[j].getGPA() > opora.getGPA()) {
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

    }