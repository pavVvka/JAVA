package Task_8_1_2;
// поля: имя, возраст, пол, ЗП в день и количество подчиненных.
public class Manager {
    private String name;
    private int age;
    private String gender;
    private int dailySalary;
    private int numOfSubordinates;

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

    public int getDailySalary() {
        return dailySalary;
    }

    public void setDailySalary(int dailySalary) {
        this.dailySalary = dailySalary;
    }

    public void setNumOfSubordinates(int numOfSubordinates) {
        this.numOfSubordinates = numOfSubordinates;
    }
    public int getNumOfSubordinates() {
        return numOfSubordinates;
    }

    public int getSalary(int days){
        double salary = dailySalary * days;
        double extra = salary * 0.01 * this.getNumOfSubordinates();
        return (int)(salary + extra);

    }
}
