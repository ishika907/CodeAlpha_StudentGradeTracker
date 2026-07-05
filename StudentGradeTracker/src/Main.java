import java.util.Scanner;

public class Main {
    public static void main(String[] args) {




        Scanner sc = new Scanner(System.in);

        StudentServices service = new StudentServices();

        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Calculate Average Marks");
            System.out.println("4. Find Student with Highest Marks");
            System.out.println("5. Find Student with Lowest Marks");
            System.out.println("6. Delete Student");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();



            switch (choice) {
                case 1:
                    try {


                        System.out.print("Enter student rollNo.: ");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter student name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter student marks: ");
                        double marks = sc.nextDouble();
                        Student student = new Student(id, name, marks);
                        service.addStudent(student);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 2:
                    service.displayStudents();
                    break;
                case 3:
                    service.calculateAverageMarks();
                    break;
                case 4:
                    service.highestmarks();
                    break;
                case 5:
                    service.lowestmarks();
                    break;
                    case 6:
                    System.out.print("Enter roll number of student to delete: ");
                    int rollNo = sc.nextInt();
                    service.deleteStudent(rollNo);
                    break;
                case 7:
                    System.out.println("Thank you for using the Student Grade Tracker!");
                    return;
                default:
                    System.out.println("Ishu . Please try again.");

            }
        }

//        Student s1 = new Student(1, "issue", 85.5);
//        service.addStudent(s1);
//        Student s2 = new Student(75, "Another Ishu", 90.0);
//        service.addStudent(s2);


//        service.displayStudents();

    }
}