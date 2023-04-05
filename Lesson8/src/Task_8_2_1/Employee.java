package Task_8_2_1;
// Задача №1
//
//Необходимо создать класс Employee со следующими методами:
//getName - получить имя
//setName
//getBaseSalary - базовая ставка
//setBaseSalary
public class Employee {
    private String name;
    private int base = 100;
    public Employee(String name, int base){
        this.name = name;
        this.base = base;
    }

    String getName(){
        return this.name;
    }

    void setName(String nm){
        this.name = nm;
    }

    int getBaseSalary(){
        return this.base;
    }

    void setBaseSalary(int bs){
        this.base = bs;
    }
}

