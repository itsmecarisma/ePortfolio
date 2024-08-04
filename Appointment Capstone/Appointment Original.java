// Carisma Carter

package appointmentservice;

import java.util.Date;
import java.util.UUID;

public class Appointment {
    private String appointmentid;
    private String appointmentdate;
    private String description;

    private static final int ID_LENGTH = 10;
    private static final int DESCRIPTION_LENGTH = 50;

    public String getID() {
        return appointmentid;
    }

    public String getDate() {
        return appointmentdate;
    }

    public String getDescription() {
        return description;
    }

    protected void setDescription(String description) {
        if (description == null) {
            throw new IllegalArgumentException("Description must not be null");
        } else if (description.length() > DESCRIPTION_LENGTH) {
            throw new IllegalArgumentException("Description must not exceed " +
                    DESCRIPTION_LENGTH + " characters");
        }
        this.description = description;
    }

    protected void setUniqueId() {
        String uuid = UUID.randomUUID().toString();
        // Use ID_LENGTH to limit the length of the appointment ID
        this.appointmentid = uuid.substring(uuid.length() - ID_LENGTH);
    }

    protected void setDate(String date) {
        if (date == null) {
            throw new IllegalArgumentException("Date must not be null");
        }
        this.appointmentdate = date;
    }

    // Constructor using Date and description
    public Appointment(Date date, String description) {
        setUniqueId();
        setDate(String.valueOf(date));
        setDescription(description);

        // Print the appointment details for debugging
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Appointment: ID=" + appointmentid + ", date=" + appointmentdate + ", description=" + description;
    }
}

