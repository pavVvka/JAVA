package Task_8_2_1;

public class Director extends BaseManager{
    public Director(String name, int base, int qtty){
        super(name, base, qtty);
    }
    int getSalaryDirector(){
        if(getNumberOfSubordinates() != 0){
            return (int) (getBaseSalary() * (getNumberOfSubordinates() * 0.09));
        }
        else return getBaseSalary();
//        else return this.base;
    }
}

