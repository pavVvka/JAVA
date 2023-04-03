package Task_8_1_var2;

public class Employee extends BaseEmployee {

    public Employee(String name, int age, String gender, int daySalary) {
        super(name, age, gender, daySalary);
    }

    public int getSalary(int days){
        return getDaySalary() * days;
    }


}
