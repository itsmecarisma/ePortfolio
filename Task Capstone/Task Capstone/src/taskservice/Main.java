package taskservice;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        TaskServiceCapStone taskService = new TaskServiceCapStone();

        // Generate and add 100 tasks
        for (int i = 1; i <= 100; i++) {
            String id = String.format("%03d", i);
            String name = "Task " + i;
            String description = "Description of Task " + i;
            taskService.addTask(new Task(id, name, description));
        }

        // Find task by ID
        Task task = taskService.findTaskById("050");
        System.out.println("Find Task by ID 050:");
        System.out.println(task);

        // Get all tasks sorted by name
        List<Task> sortedTasks = taskService.getAllTasksSortedByName();
        System.out.println("All Tasks Sorted by Name:");
        for (Task t : sortedTasks) {
            System.out.println(t);
        }

        // Get highest priority task
        Task highestPriorityTask = taskService.getHighestPriorityTask();
        System.out.println("Highest Priority Task:");
        System.out.println(highestPriorityTask);

        // Delete a task
        boolean isDeleted = taskService.deleteTask("001");
        System.out.println("Task with ID 001 deleted: " + isDeleted);

        // Find task index by ID
        int index = taskService.findTaskIndexById("075");
        System.out.println("Index of Task with ID 075: " + index);
    }
}
