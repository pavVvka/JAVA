package Task_8_1_2;

public class Task_8_1_2 {
    public static void main(String[] args) {
        Manager mngr1 = new Manager();
        mngr1.setName("Pavel");
        mngr1.setGender("male");
        mngr1.setAge(44);
        mngr1.setDailySalary(10);
        mngr1.setNumOfSubordinates(1);

        System.out.println(mngr1.getSalary(15));
    }
}
