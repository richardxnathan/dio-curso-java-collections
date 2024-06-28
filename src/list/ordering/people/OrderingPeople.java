package src.list.ordering.people;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrderingPeople {

    private List<People> peoples = new ArrayList<>();

    public void addPeople(String name, int age, double height){
        peoples.add(new People(name, age, height));
    }

    public List<People> orderByAge(){
        List<People> orderedPeopleAge = new ArrayList<>(peoples);

        Collections.sort(orderedPeopleAge);

        return orderedPeopleAge;
    }

    public List<People> orderByHeight(){
        List<People> orderedPeopleHeight = new ArrayList<>(peoples);

        Collections.sort(orderedPeopleHeight, new ComparatorByHeight());

        return orderedPeopleHeight;
    }

}
