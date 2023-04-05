package Task_9;

public class Director extends Employee{
    private int qtty;

    public Director(String name, int base, int qtty) {
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
        return (int) (super.getSalary() * getNumberOfSubordinates() * 0.09);
    }
}
