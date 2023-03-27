package Task_8_1_1;
// класс Employee с полями: имя, возраст, пол и ЗП в день.
// метод - getSalary(int days), метод возвращает зарплату
// за количество дней которые были переданы в качестве аргумента.
public class Employee {
    private String name;
    private int age;
    private String gender;
    private int dailySalary;
// setters
    public void setName(String nameX){
        this.name = nameX;
    }
    public void setAge(int ageX){
        this.age = ageX;
    }
    public void setGender(String genderX){
        this.gender = genderX;
    }
    public void setDailySalary(int dailySalaryX){
        this.dailySalary = dailySalaryX;
    }
// getters
    String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public int getDailySalary() {
        return dailySalary;
    }

    double getSalary(int days){
        return dailySalary * days;
    }
}
