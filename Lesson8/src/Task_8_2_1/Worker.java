package Task_8_2_1;
// Необходимо создать класс Worker где метод getSalaryWorker  будет возвращать зарплату, базовую ставку.
public class Worker extends Employee {
    public Worker(String name, int base) {
        super(name, base);
    }

    int getSalaryWorker(){
//        return this.base;
        return getBaseSalary();
    }
}
