import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementSystem {
    static ArrayList<StudentClass> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n=== Student Record Management ===");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: addStudent(); break;
                case 2: viewStudents(); break;
                case 3: updateStudent(); break;
                case 4: deleteStudent(); break;
                case 5: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice!");
            }
        } while (choice != 5);
    }

    static void addStudent() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // Consume newline

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();

        students.add(new StudentClass(id, name, marks));
        System.out.println("Student added");
    }
    static void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No records found.");
            return;
        }
        for (StudentClass s : students) {
            System.out.println(s+"\n");
        }
    }

    static void updateStudent() {
        System.out.print("Enter ID to update: ");
        int id = sc.nextInt();
        boolean found = false;
        for (StudentClass s : students) {
            if (s.getId() == id) {
                sc.nextLine(); // Consume newline
                System.out.print("Enter new name: ");
                s.setName(sc.nextLine());
                System.out.print("Enter new marks: ");
                s.setMarks(sc.nextDouble());
                System.out.println("Record updated.");
                found = true;
                break;
            }
        }
        if (!found) System.out.println("Student not found.");
    }

    static void deleteStudent() {
        System.out.print("Enter ID to delete: ");
        int id = sc.nextInt();
        StudentClass toRemove = null;
        for (StudentClass s : students) {
            if (s.getId() == id) {
                toRemove = s;
                break;
            }
        }
        if (toRemove != null) {
            students.remove(toRemove);
            System.out.println("Student removed.");
        } else {
            System.out.println("Student not found.");
        }
    }

    /*public static class Student{
        private int id;
        private String name;
        private Double marks;
        public Student(int id, String name, Double marks) {
            this.id = id;
            this.name = name;
            this.marks = marks;
        }

        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public Double getMarks() {
            return marks;
        }
        public void setMarks(Double marks) {
            this.marks = marks;
        }

        @Override
        public String toString() {
            return "ID: " + id + ", Name: " + name + ", Marks: " + marks;
        }
    }*/
}
