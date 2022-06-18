package functionalinterface;

import java.util.List;
import java.util.function.Consumer;

import javabasics.Student;
import javabasics.StudentDatabase;

public class ConsumerInterfaceExample {
    static List<Student> studentList = StudentDatabase.getAllStudents();
    static Consumer<Student> studentName = (student) -> System.out.print(student.getName());
    static Consumer<Student> studentActivity = (student) -> System.out.println(student.getActivities());

    public static void printStudents() {
        
        Consumer<Student> student = (Student studentRecord) -> System.out.println(studentRecord);
        studentList.forEach(studentRecord -> student.accept(studentRecord));
    }

    public static void printNameAndActivities() {
        studentList.forEach(studentName.andThen(studentActivity));
    }

    public static void printNameAndActivitiesWithGrades() {
        System.out.println("printNameAndActivitiesWithGrades");
        Consumer<Student> studentGrades = (student) -> {
            if (student.getGradeLevel() > 3) {
                studentName.andThen(studentActivity).accept(student);
            }
        };
        studentList.forEach(studentGrades);
    }

    public static void printNameAndActivitiesWithGpa() {
        System.out.println("printNameAndActivitiesWithGpa");
        Consumer<Student> studentGpa = (student) -> {
            if(student.getGpa() > 3.5) {
                studentName.accept(student);
            }
        };

        studentList.forEach(studentGpa);
    }
    public static void main(String[] args) {
        Consumer<String> printMessage = (name) -> System.out.println("My name is " + name);
        printMessage.accept("Yash Shah");
        printStudents();
        printNameAndActivities();
        printNameAndActivitiesWithGrades();
    }
}
