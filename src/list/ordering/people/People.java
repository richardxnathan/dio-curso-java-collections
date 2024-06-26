package src.list.ordering.people;

public class People implements Comparable<People> {

    private String name;
    private int age;
    private double height;

    public People(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public int compareTo(People p) {
        return Integer.compare(age, p.getAge());
    }

}
