import java.util.ArrayList;

public class StudentServices {

    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {

        if(student.getMarks() < 0 || student.getMarks() >100){
            throw new IllegalArgumentException("Marks should be between 0 and 100");
        }

        students.add(student);
        System.out.println("Student added successfully.");
    }


 public void displayStudents()  {

    if(students.isEmpty()){
        System.out.println("No students to display.");

    }
     for (Student student : students) {
         System.out.println("Roll No : " + student.getRollNo());
         System.out.println("Name : " + student.getName());
         System.out.println("Marks : " + student.getMarks());
         System.out.println("Grade : " + calculateGrade(student.getMarks()));
         System.out.println("------------------------");
     }
 }

 public void calculateAverageMarks() {
    if (students.isEmpty()) {
        System.out.println("No students to calculate average grades.");
        return;
    }

    double total = 0;
    for (Student student : students) {
        total += student.getMarks();
    }
    double average = total / students.size();
    System.out.println("Average Marks: " + average);
 }

 public void highestmarks() {
    if (students.isEmpty()) {
        System.out.println("No students to find highest marks.");
        return;
    }

    Student highestStudent = students.get(0);
    for (Student student : students) {
        if (student.getMarks() > highestStudent.getMarks()) {
            highestStudent = student;
        }
    }
    System.out.println("Student with Highest Marks: " + highestStudent);
 }

 public void lowestmarks() {
    if (students.isEmpty()) {
        System.out.println("No students to find lowest marks.");
        return;
    }

    Student lowestStudent = students.get(0);
    for (Student student : students) {
        if (student.getMarks() < lowestStudent.getMarks()) {
            lowestStudent = student;
        }
    }
    System.out.println("Student with Lowest Marks: " + lowestStudent);
 }


    public void deleteStudent(int rollNo) {
        if(students==null || students.isEmpty()){
            System.out.println("No students to delete.");
            return;
        }
        students.removeIf(student -> student.getRollNo() == rollNo);
        System.out.println("Student deleted successfully.");
    }


    public String calculateGrade(double marks) {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 70) {
            return "B";
        } else if (marks >= 60) {
            return "C";
        } else {
            return "D";
        }
    }
}