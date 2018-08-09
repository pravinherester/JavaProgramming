import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArraySort {
    public static void main(String[] args) throws IOException {
        Integer a[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        Arrays.sort(a, Collections.reverseOrder());
        System.out.println(Arrays.toString(a));

        Arrays.sort(a, Collections.reverseOrder());
        Arrays.sort(a, 0, 4);
        System.out.println(Arrays.toString(a));

        String input[] = { "hello", "my", "name", "is", "aravind" };
        Arrays.sort(input);
        System.out.println(Arrays.toString(input));
        Arrays.sort(input, Collections.reverseOrder());
        System.out.println(Arrays.toString(input));

        List<Student> students = new ArrayList<Student>();
        Student stud1 = new Student(4, "Pravin");
        Student stud2 = new Student(2, "Rahul");
        Student stud3 = new Student(3, "Dravid");
        Student stud4 = new Student(1, "Jammy");
        students.add(stud1);
        students.add(stud2);
        students.add(stud3);
        students.add(stud4);
        System.out.println(students);
        Collections.sort(students,new StudentSortByRoll ());
        System.out.println(students);
        Collections.sort(students,new StudentSortByName());
        System.out.println(students);
        Collections.sort(students);
    }
}


