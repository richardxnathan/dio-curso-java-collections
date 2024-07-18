package src.map.Ordering.Events;

public class Event {

    private String name;
    private String attractionName;

    public Event(String name, String attractionName) {
        this.name = name;
        this.attractionName = attractionName;
    }

    public String getName() {
        return name;
    }

}
