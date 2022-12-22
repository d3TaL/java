package practice1;


import static practice1.SortingStudentsByGPA.quickSort;

public class MergeStud {

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
}
