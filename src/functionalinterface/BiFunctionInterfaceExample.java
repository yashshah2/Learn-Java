package functionalinterface;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import javabasics.Student;
import javabasics.StudentDatabase;

public class BiFunctionInterfaceExample {

    static BiFunction<List<Student>, Predicate<Student>, Map<String, Integer>> studentBifunction = (studentList, isValideGrade) -> {
        Map<String, Integer> studentMap = new HashMap<>();
        studentList.forEach((student) -> {
            if (isValideGrade.test(student)) {
                studentMap.put(student.getName(), student.getGradeLevel());
            }
        });
        return studentMap;
    };  
    public static void main(String[] args) {
        Map<String, Integer> studentMap = studentBifunction.apply(StudentDatabase.getAllStudents(), PredicateStudentExample.studentPredicateGrade);
        StudentFunctionalInterface.printStudentMap.accept(studentMap);
    }
}
