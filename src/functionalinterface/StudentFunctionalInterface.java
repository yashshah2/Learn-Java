package functionalinterface;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;

import javabasics.Student;
import javabasics.StudentDatabase;

public class StudentFunctionalInterface {
    static Consumer<Map<String, Integer>> printStudentMap = (studentMap) -> {
        System.out.println(studentMap);
    }; 
    static Function<List<Student>, Map<String, Integer>> studentFunction = (students) -> {
        Map<String, Integer> studentMap = new HashMap<>();
        students.forEach((student) -> {
            if(PredicateStudentExample.studentPredicateGrade.test(student)) {
                studentMap.put(student.getName(), student.getGradeLevel());
            }
        });
        return studentMap;
    };
   
    public static void main(String[] args) {
        Map<String, Integer> studentMapDetails = studentFunction.apply(StudentDatabase.getAllStudents());
        printStudentMap.accept(studentMapDetails);
    }    
}
