//Carisma Carter

package taskservice;

import java.util.Comparator;

public class Task {
    
    private String id;
    private String name;
    private String description;

    // Constructor to initialize the Task object
    public Task(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    // Getter for the 'id' field
    public String getId() {
        return id;
    }

    // Setter for the 'id' field
    public void setId(String id) {
        this.id = id;
    }

    // Getter for the 'name' field
    public String getName() {
        return name;
    }

    // Setter for the 'name' field
    public void setName(String name) {
        this.name = name;
    }

    // Getter for the 'description' field
    public String getDescription() {
        return description;
    }

    // Setter for the 'description' field
    public void setDescription(String description) {
        this.description = description;
    }

    // Overriding the 'equals' method for Task comparison
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null)
            return false;

        if (this.getClass() != obj.getClass())
            return false;

        Task t = (Task) obj;
        return getId().equals(t.getId());
    }

    // Comparator to compare Task objects by 'id'
    public static Comparator<Task> compareById = new Comparator<Task>() {
        @Override
        public int compare(Task t1, Task t2) {
            return t1.getId().compareTo(t2.getId());
        }
    };

    // Overriding the 'toString' method to provide a string representation of Task
    @Override
    public String toString() {
        return "Task ID: " + getId() + "\nName: " + getName() + "\nDescription: " + getDescription() + "\n";
    }
}
