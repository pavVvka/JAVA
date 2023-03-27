package Task_8_1_1;
// Необходимо создать класс Employee с полями: имя, возраст, пол и ЗП в день.
// Все поля сделать приватными и для каждого поля добавить методы set и get.
// Класс должен иметь метод - getSalary(int days), метод возвращает зарплату
// за количество дней которые были переданы в качестве аргумента.

public class Task_8_1_1 {
    public static void main(String[] args) {
        Employee empl1 = new Employee();
        empl1.setName("Pavel");
        empl1.setGender("male");
        empl1.setAge(44);
        empl1.setDailySalary(10);

        System.out.println(empl1.getSalary(15));
    }
}
