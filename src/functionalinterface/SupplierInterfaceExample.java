package functionalinterface;

import java.util.List;
import java.util.function.Supplier;

import javabasics.Student;
import javabasics.StudentDatabase;

public class SupplierInterfaceExample {
    static Supplier<List<Student>> getStudentDetails = () -> {
        return StudentDatabase.getAllStudents();
    };
    public static void main(String[] args) {
      System.out.println(getStudentDetails.get());  
    }
}
