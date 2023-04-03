package Task_8_1_var2;

public class BaseEmployee {
    private String name;
    private int age;
    private String gender;
    private int daySalary;

    public BaseEmployee(String name, int age, String gender, int daySalary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.daySalary = daySalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getDaySalary() {
        return daySalary;
    }

    public void setDaySalary(int daySalary) {
        this.daySalary = daySalary;
    }
}
