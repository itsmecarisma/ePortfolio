package taskservice;

import java.util.List;

class TaskServiceCapStone {

    private TaskLinkedList taskList;
    private TaskPriorityQueue taskQueue;

    public TaskServiceCapStone() {
        taskList = new TaskLinkedList();
        taskQueue = new TaskPriorityQueue();
    }

    public void addTask(Task task) {
        taskList.add(task);
        taskQueue.addTask(task);
    }

    public boolean deleteTask(String id) {
        Task task = taskList.findById(id);
        if (task != null) {
            taskQueue.removeTask(task);
            return taskList.delete(id);
        }
        return false;
    }

    public Task findTaskById(String id) {
        return taskList.findById(id);
    }

    public Task getHighestPriorityTask() {
        return taskQueue.getHighestPriorityTask();
    }

    public List<Task> getAllTasksSortedByName() {
        List<Task> tasks = taskList.toList();
        TaskSorter.mergeSort(tasks);
        return tasks;
    }

    public int findTaskIndexById(String id) {
        List<Task> tasks = taskList.toList();
        TaskSorter.mergeSort(tasks); // Ensure the list is sorted before binary search
        return TaskBinarySearch.binarySearch(tasks, id);
    }
}

