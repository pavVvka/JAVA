package Task_8_1_var2;

public class Manager extends BaseEmployee {
    private int numWorkers;
    public Manager(String name, int age, String gender, int daySalary, int numWorkers){
        super(name, age, gender, daySalary);
        this.numWorkers = numWorkers;
    }

    public int getNumWorkers() {
        return numWorkers;
    }

    public void setNumWorkers(int numWorkers) {
        this.numWorkers = numWorkers;
    }

    public int getSalary(int days){
        int salary = getDaySalary() * days;
        int perWorker = (int) (salary * 0.01 * getNumWorkers());
        return salary + perWorker;
    }


}
