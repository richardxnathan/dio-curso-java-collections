package src.list;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {

    private List<Task> tasks = new ArrayList<>();

    public void addTask(String description){
        tasks.add(new Task(description));
    }

    public void removeTask(String description){
        for (Task t : tasks) {
            if (t.getDescription().equals(description)){
                tasks.remove(t);
            }
        }
    }

    public int getTotalNumberTasks(){
        return tasks.size();
    }

    public void getDescriptionsTasks(String description){
        for (Task t : tasks) {
            System.out.println(t.getDescription());
        }
    }

}
