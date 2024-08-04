package taskservice;

import java.util.PriorityQueue;

class TaskPriorityQueue {

    private PriorityQueue<Task> taskQueue;

    public TaskPriorityQueue() {
        taskQueue = new PriorityQueue<>(Task.compareById);
    }

    public void addTask(Task task) {
        taskQueue.add(task);
    }

    public Task getHighestPriorityTask() {
        return taskQueue.poll();
    }

    public boolean removeTask(Task task) {
        return taskQueue.remove(task);
    }
}

