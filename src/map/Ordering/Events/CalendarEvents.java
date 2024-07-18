package src.map.Ordering.Events;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CalendarEvents {

    private Map<LocalDate, Event> events = new HashMap<>();

    public void addEvent(LocalDate date, String name, String attractionName){
        events.put(date, new Event(name, attractionName));
    }

    public void showEvents(){
        Map<LocalDate, Event> treeMapEvents = new TreeMap<>(events);

        for (Map.Entry<LocalDate, Event> entry : treeMapEvents.entrySet()) {
            System.out.println("Date: " + entry.getKey() + " - Event: " + entry.getValue().getName());
        }
    }

    public void getNextEvent(){
        LocalDate currentDate = LocalDate.now();
        LocalDate date = null;
        Event event = null;

        for (Map.Entry<LocalDate, Event> entry : events.entrySet()) {
            LocalDate eventDate = entry.getKey();
            if (eventDate.isEqual(currentDate) || eventDate.isAfter(currentDate)) {
                date = eventDate;
                event = entry.getValue();
                break;
            }
        }

        if (event != null) {
            System.out.println("The next event is " + event.getName() + " and will be  " + date);
        } else {
            System.out.println("There are no upcoming events.");
        }
    }

}
