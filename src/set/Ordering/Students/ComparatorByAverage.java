package src.set.Ordering.Students;

import java.util.Comparator;

public class ComparatorByAverage implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s1.getAverage(), s2.getAverage());
    }

}
