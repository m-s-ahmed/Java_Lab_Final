import java.util.Scanner;
import java.util.ArrayList;



 class Student {
    private String studentID; // Unique ID for the student
    private String name;      // Name of the student
    private String grade;     // Grade of the student (e.g., A, B, etc.)
    private double gpa;       // Grade Point Average

    // Constructor to initialize Student attributes
    public Student(String studentID, String name, String grade, double gpa) {
        this.studentID = studentID;
        this.name = name;
        this.grade = grade;
        this.gpa = gpa;
    }

    // Getters and Setters for each attribute
    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    // Method to display student information
    public void displayInfo() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("GPA: " + gpa);
    }
}


 class StudentDatabase {
    private ArrayList<Student> students; // List to store Student objects

    // Constructor to initialize the students list
    public StudentDatabase() {
        students = new ArrayList<>();
    }

    // Method to add a new student to the database
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully!");
    }

    // Method to display information about all students
    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students in the database.");
            return;
        }
        for (Student student : students) {
            student.displayInfo();
            System.out.println("---------------------------");
        }
    }

    // Method to search for a student by ID
    public void searchStudentByID(String studentID) {
        for (Student student : students) {
            if (student.getStudentID().equals(studentID)) {
                System.out.println("Student found:");
                student.displayInfo();
                return;
            }
        }
        System.out.println("Student with ID " + studentID + " not found.");
    }
}




public class studentInformationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentDatabase database = new StudentDatabase();

        while (true) {
            System.out.println("Student Information System");
            System.out.println("1. Add New Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1: // Add new student
                    System.out.print("Enter Student ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Grade: ");
                    String grade = scanner.nextLine();
                    System.out.print("Enter GPA: ");
                    double gpa = scanner.nextDouble();

                    Student student = new Student(id, name, grade, gpa);
                    database.addStudent(student);
                    break;

                case 2: // Display all students
                    database.displayAllStudents();
                    break;

                case 3: // Search student by ID
                    System.out.print("Enter Student ID to search: ");
                    String searchID = scanner.nextLine();
                    database.searchStudentByID(searchID);
                    break;

                case 4: // Exit
                    System.out.println("Exiting the system. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
