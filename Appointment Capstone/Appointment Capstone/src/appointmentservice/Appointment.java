package appointmentservice;

import java.text.SimpleDateFormat;
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
            throw new IllegalArgumentException("Description must not be null. Please provide a valid description.");
        } else if (description.length() > DESCRIPTION_LENGTH) {
            throw new IllegalArgumentException("Description must not exceed " +
                    DESCRIPTION_LENGTH + " characters. Please shorten the description to fit within the character limit.");
        }
        this.description = description;
    }

    protected void setUniqueId() {
        String uuid = UUID.randomUUID().toString();
        // Use ID_LENGTH to limit the length of the appointment ID
        this.appointmentid = uuid.substring(0, ID_LENGTH);
    }

    protected void setDate(String date) {
        if (date == null) {
            throw new IllegalArgumentException("Date must not be null. Please provide a valid date.");
        }
        if (!isFutureDate(date)) {
            throw new IllegalArgumentException("Appointment date must be in the future. Please select a valid future date.");
        }
        this.appointmentdate = date;
    }

    private boolean isFutureDate(String date) {
        try {
            Date appointmentDate = new SimpleDateFormat("yyyy-MM-dd").parse(date);
            return appointmentDate.after(new Date());
        } catch (Exception e) {
            throw new IllegalArgumentException("Invalid date format. Please use the format yyyy-MM-dd.");
        }
    }

    // Constructor using Date and description
    public Appointment(Date date, String description) {
        setUniqueId();
        setDate(new SimpleDateFormat("yyyy-MM-dd").format(date));
        setDescription(description);
    }

    @Override
    public String toString() {
        return "Appointment: ID=" + appointmentid + ", date=" + appointmentdate + ", description=" + description;
    }

    public static void main(String[] args) {
        // Generate and add 100 appointments
        for (int i = 1; i <= 100; i++) {
            try {
                Appointment validAppointment = new Appointment(new Date(System.currentTimeMillis() + (86400000L * i)), "Description for appointment " + i);
                System.out.println(validAppointment);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        // Test various edge cases
        try {
            // Invalid null description
            new Appointment(new Date(System.currentTimeMillis() + 86400000), null);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            // Invalid long description
            new Appointment(new Date(System.currentTimeMillis() + 86400000), "This description is way too long and exceeds the fifty character limit.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            // Invalid past date
            new Appointment(new Date(System.currentTimeMillis() - 86400000), "Past date description");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            // Invalid date format
            new Appointment(new SimpleDateFormat("yyyy-MM-dd").parse("invalid-date"), "Invalid date format");
        } catch (Exception e) {
            System.out.println("Unparseable date: \"invalid-date\"");
        }
    }
}
