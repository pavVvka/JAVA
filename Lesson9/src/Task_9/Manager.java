package Task_9;

public class Manager extends Employee{
    private int qtty;
    public Manager(String name, int base, int qtty){
        super(name, base);
        this.qtty = qtty;
    }
    public int getNumberOfSubordinates(){
        return qtty;
    }
    public void setNumberOfSubordinates(int qty){
        this.qtty = qty;
    }
    @Override
    public int getSalary(){
        if(getNumberOfSubordinates() == 0){
            return super.getSalary();
        }
        return (int) (super.getSalary() * getNumberOfSubordinates() * 0.03);
    }
}
