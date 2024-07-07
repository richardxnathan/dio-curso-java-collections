package src.set.Research.Tasks;

import java.util.HashSet;
import java.util.Set;

public class ToDoList {

    private Set<Task> tasks = new HashSet<>();

    public void addTask(String description){
        tasks.add(new Task(description));
    }

    public void removeTask(String description){
        for (Task t : tasks) {
            if (t.getDescription().equals(description)){
                tasks.remove(t);
                System.out.println();
            }
        }
    }

    public void showTasks(){
        System.out.println(tasks);
    }

    public void countTasks(){
        System.out.println("O número de tarefas é de " + tasks.size());
    }

    public Set<Task> getTasksCompleted(){
        Set<Task> doneTasks = new HashSet<>();

        for (Task t : tasks) {
            if (t.isDone()){
                doneTasks.add(t);
            }
        }

        return doneTasks;
    }

    public Set<Task> getTasksToDo(){
        Set<Task> toDoTasks = new HashSet<>();

        for (Task t : tasks) {
            if (t.isDone() == false){
                toDoTasks.add(t);
            }
        }

        return toDoTasks;
    }

    public void markTaskCompleted(String description){
        for (Task t : tasks) {
            if (t.getDescription().equals(description)){
                t.setDone(true);
            }
        }
    }

    public void markTaskToDo(String description){
        for (Task t : tasks) {
            if (t.getDescription().equals(description)){
                t.setDone(false);
            }
        }
    }

    public void clearToDoList(){
        tasks.clear();
    }

}
