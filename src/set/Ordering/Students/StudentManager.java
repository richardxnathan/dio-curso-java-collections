package src.set.Ordering.Students;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class StudentManager {

    private Set<Student> students = new HashSet<>();

    public void addStudent(String name, long enrollment, double average){
        students.add(new Student(name, enrollment, average));
    }

    public void removeStudent(long enrollment){
        for (Student s : students) {
            if (s.getEnrollment() == enrollment){
                students.remove(s);
            }
        }
    }

    public void showStudentsByName(){
        Set<Student> studentsByName = new TreeSet<>(students);

        System.out.println(studentsByName);
    }

    public void showStudentsByAverage(){
        Set<Student> studentsByAverage = new TreeSet<>(new ComparatorByAverage());
        studentsByAverage.addAll(students);

        System.out.println(studentsByAverage);
    }

    public void showStudents(){
        System.out.println(students);
    }

}
