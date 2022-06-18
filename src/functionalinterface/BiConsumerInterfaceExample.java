package functionalinterface;

import java.util.List;
import java.util.function.BiConsumer;

import javabasics.Student;
import javabasics.StudentDatabase;

public class BiConsumerInterfaceExample {

    public static void printNameAndActivities(){
        List<Student> studentList = StudentDatabase.getAllStudents();
        BiConsumer<String, List<String>> studentNamesAndActivities = (name, activitiesList) -> {
            System.out.println("name::" + name);
            System.out.println(activitiesList);
        };

        studentList.forEach((student -> studentNamesAndActivities.accept(student.getName(), student.getActivities())));
    }

    public static void main(String[] args) {
        BiConsumer<Integer, Integer> addition = (a, b) -> {
            System.out.println("Addition:: " + (a+b));
        };
        addition.accept(3, 4);

        printNameAndActivities();

    }
}
