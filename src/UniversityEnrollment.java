import java.util.Scanner;

class CourseFullException extends Exception {
    public CourseFullException(String message) {
        super(message);
    }
}

class PrerequisiteNotMetException extends Exception {
    public PrerequisiteNotMetException(String message) {
        super(message);
    }
}

public class UniversityEnrollment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxSeats = 2;
        int enrolledStudents = 2;

        System.out.print("Enroll in Course: ");
        String course = sc.nextLine();

        System.out.print("Prerequisite: ");
        String prerequisite = sc.nextLine();

        System.out.print("Status (completed/not completed): ");
        String status = sc.nextLine();

        try {
            if (!status.equalsIgnoreCase("completed")) {
                throw new PrerequisiteNotMetException("Complete " + prerequisite + " before enrolling in " + course + ".");
            }
            if (enrolledStudents >= maxSeats) {
                throw new CourseFullException(course + " is full.");
            }

            System.out.println("Enrolled successfully in " + course + "!");
        } catch (PrerequisiteNotMetException | CourseFullException e) {
            System.out.println("Error: " + e.getClass().getSimpleName() + " - " + e.getMessage());
        }
    }
}
