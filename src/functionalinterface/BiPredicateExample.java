package functionalinterface;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

import javabasics.Student;
import javabasics.StudentDatabase;

public class BiPredicateExample {
    
    BiPredicate<Integer, String> studentFilter = (grade, gender) -> {
        if(grade >= 1 && gender == "female") {
            return true;
        } 
        else {
            return false;
        }
    };
    
    Consumer<Student> studentConsumer = (student) -> {
        if(studentFilter.test(student.getGradeLevel(), student.getGender())) {
            System.out.println(student.getName() + " : "+ student.getGradeLevel() +" : "+ student.getActivities());
        }
    };
    public void printStudentDetails() {
        List<Student> studentList = StudentDatabase.getAllStudents(); 
        studentList.forEach(student -> studentConsumer.accept(student));
    }
    public static void main(String[] args) {
        BiPredicateExample obj = new BiPredicateExample();
        obj.printStudentDetails();   
    }
}
