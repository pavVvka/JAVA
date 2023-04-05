package Task_8_2_1;

public class Manager extends BaseManager{
    public Manager(String name, int base, int qtty){
        super(name, base, qtty);
    }
    public int getSalaryManager(){
//        if (this.qtty != 0){
        if (getNumberOfSubordinates() != 0){
            return (int) (getBaseSalary() *  (getNumberOfSubordinates() * 0.03));
        }
        else return getBaseSalary();
    }
}
