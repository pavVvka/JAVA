package Task_8_2_1;

public class BaseManager extends Employee {
    private int qtty;
    public BaseManager(String name, int base, int qtty){
        super(name, base);
        this.qtty = qtty;
    }

    public int getNumberOfSubordinates(){
        return qtty;
    }

    public void setNumberOfSubordinates(int qtty){
        this.qtty = qtty;
    }



}
