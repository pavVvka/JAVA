package Task_7_1;

public class Employee {
    String name;
    int age;
    int gender;
    int salary;
//    int [] employeeArray;

//    boolean isSameName(String input) {
//        return name == input;
    boolean isSameName(Employee employee) {
        return name.equals(employee.name) ;
    }
}

