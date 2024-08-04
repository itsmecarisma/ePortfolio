package taskservice;

import java.util.List;

class TaskBinarySearch {

    public static int binarySearch(List<Task> tasks, String id) {
        int low = 0;
        int high = tasks.size() - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            Task midTask = tasks.get(mid);

            if (midTask.getId().compareTo(id) == 0) {
                return mid;
            } else if (midTask.getId().compareTo(id) < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1; // ID not found
    }
}

