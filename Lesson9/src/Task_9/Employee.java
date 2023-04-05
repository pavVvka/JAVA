package Task_9;

public class Employee {
    private String name;
    private int base;

    public Employee(String name, int base) {
        this.name = name;
        this.base = base;
    }

    public String getName(){
        return name;
    }
    public void setName(String nm){
        name = nm;
    }

    public int getSalary() {
        return base;
    }

    public void setSalary(int bs) {
        base = bs;
    }
}
