public class JavaBasicExample {
    String employeeName;
    String employeeDob;
    String employeeId;
    Long employeeContactNo;
    int totalSalary;
    static int tax = 500;

    private JavaBasicExample(String employeeName, String employeeDob, String employeeId, Long employeeContactNo) {
        this.employeeName = employeeName;
        this.employeeDob = employeeDob;
        this.employeeId = employeeId;
        this.employeeContactNo = (Long)employeeContactNo;
    }

    private int calculateEmployeeSalary(int salary, int pf) {
        totalSalary = salary + pf;
        return this.totalSalary;
    }

    private int calculateEmployeeSalary(int salary, int pf, int tax) {
         return salary + pf - tax;
    }

    public static void main(String[] args) {
        JavaBasicExample javaBasicObject = new JavaBasicExample("Yash Shah", "2nd November 1997", "1234", (long) 123);
        int totalSalary = javaBasicObject.calculateEmployeeSalary(10000, 5000);
        System.out.println("totalSalary::" + totalSalary);
        System.out.println("totalSalary Without TAX::" + javaBasicObject.calculateEmployeeSalary(10000, 5000, tax));
    }
}
