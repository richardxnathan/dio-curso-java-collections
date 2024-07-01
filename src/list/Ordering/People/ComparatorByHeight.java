package src.list.Ordering.People;

import java.util.Comparator;

public class ComparatorByHeight implements Comparator<People> {

    @Override
    public int compare(People p1, People p2) {
        return Double.compare(p1.getHeight(), p2.getHeight());
    }

}
