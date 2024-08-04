package taskservice;

import java.util.ArrayList;
import java.util.List;

class TaskLinkedList {

    private Node head;

    private class Node {
        Task task;
        Node next;

        Node(Task task) {
            this.task = task;
        }
    }

    // Add task to the linked list
    public void add(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Delete task by ID
    public boolean delete(String id) {
        if (head == null) {
            return false;
        }
        if (head.task.getId().equals(id)) {
            head = head.next;
            return true;
        }
        Node current = head;
        while (current.next != null && !current.next.task.getId().equals(id)) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
            return true;
        }
        return false;
    }

    // Find task by ID
    public Task findById(String id) {
        Node current = head;
        while (current != null) {
            if (current.task.getId().equals(id)) {
                return current.task;
            }
            current = current.next;
        }
        return null;
    }

    // Convert linked list to list
    public List<Task> toList() {
        List<Task> list = new ArrayList<>();
        Node current = head;
        while (current != null) {
            list.add(current.task);
            current = current.next;
        }
        return list;
    }
}

