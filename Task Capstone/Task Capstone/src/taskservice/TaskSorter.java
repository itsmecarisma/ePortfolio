package taskservice;

import java.util.ArrayList;
import java.util.List;

class TaskSorter {

    public static void mergeSort(List<Task> tasks) {
        if (tasks.size() <= 1) {
            return;
        }

        List<Task> left = new ArrayList<>();
        List<Task> right = new ArrayList<>();

        int middle = tasks.size() / 2;
        for (int i = 0; i < middle; i++) {
            left.add(tasks.get(i));
        }
        for (int i = middle; i < tasks.size(); i++) {
            right.add(tasks.get(i));
        }

        mergeSort(left);
        mergeSort(right);

        merge(tasks, left, right);
    }

    private static void merge(List<Task> tasks, List<Task> left, List<Task> right) {
        int leftIndex = 0;
        int rightIndex = 0;
        int tasksIndex = 0;

        while (leftIndex < left.size() && rightIndex < right.size()) {
            if (left.get(leftIndex).getName().compareTo(right.get(rightIndex).getName()) <= 0) {
                tasks.set(tasksIndex++, left.get(leftIndex++));
            } else {
                tasks.set(tasksIndex++, right.get(rightIndex++));
            }
        }

        while (leftIndex < left.size()) {
            tasks.set(tasksIndex++, left.get(leftIndex++));
        }

        while (rightIndex < right.size()) {
            tasks.set(tasksIndex++, right.get(rightIndex++));
        }
    }
}

