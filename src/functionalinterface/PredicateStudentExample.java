package functionalinterface;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

import javabasics.Student;
import javabasics.StudentDatabase;

public class PredicateStudentExample {
    static List<Student> studentList = StudentDatabase.getAllStudents();
    static Predicate<Student> studentPredicateGrade = (student) -> {
        return student.getGradeLevel() >=3;
    };
    static Predicate<Student> studentPredicateGender = (student) -> {
        return student.getGender() == "male";
    };

    BiConsumer<String, List<String>> printNameAndActivities = (name, activities) -> System.out.println(name + "=" + activities);

    Consumer<Student> printFilteredStudents = (student) -> {
        if (studentPredicateGender.and(studentPredicateGrade).test(student)) {
            printNameAndActivities.accept(student.getName(), student.getActivities());
        }
    };

    public void filterStudentByGradeLevel() {
        studentList.forEach(printFilteredStudents);
    }
    public static void main(String[] args) {
        PredicateStudentExample obj = new PredicateStudentExample();
        obj.filterStudentByGradeLevel();
    }
}
