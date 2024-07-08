package src.set.Ordering.Students;

import java.util.Comparator;

public class Student implements Comparable<Student> {

    private String name;
    private long enrollment;
    private double average;

    public Student(String name, long enrollment, double average) {
        this.name = name;
        this.enrollment = enrollment;
        this.average = average;
    }

    public String getName() {
        return name;
    }

    public long getEnrollment() {
        return enrollment;
    }

    public double getAverage() {
        return average;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", enrollment=" + enrollment +
                ", average=" + average +
                '}';
    }

    @Override
    public int compareTo(Student s) {
        return name.compareToIgnoreCase(s.getName());
    }

}
