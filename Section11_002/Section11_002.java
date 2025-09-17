package Section11_002;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Section11_002 {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Nguyen Van A",23, 7.0),
                new Student("Nguyen Van B",23,10.0),
                new Student("Nguyen Van C",21,9.0),
                new Student("Nguyen Van D",20,5.0),
                new Student("Nguyen Van E",23,6.0),
                new Student("Nguyen Van G",23,10.0),
                new Student("Nguyen Van H",23,5.0),
                new Student("Nguyen Van I",21,7.0),
                new Student("Nguyen Van K",19,9.0),
                new Student("Nguyen Van L",30,6.0)
        );
        List<Student> checkScores = students.stream()
                .filter(s -> s.getScore() > 7)
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());

        for (Student student : checkScores) {
            System.out.printf("|| %s || %d || %f \n",student.getName(),student.getAge(),student.getScore());
        }
        }
    }
