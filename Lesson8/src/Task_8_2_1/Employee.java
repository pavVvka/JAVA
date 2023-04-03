package Task_8_2_1;
// Задача №1
//
//Необходимо создать класс Employee со следующими методами:
//getName - получить имя
//setName
//getBaseSalary - базовая ставка
//setBaseSalary
public class Employee {
    String name;
    int base;

    String getName(){
        return this.name;
    }

    String setName(String nm){
        return this.name = nm;
    }

    int getBaseSalary(){
        return this.base;
    }

    int setBaseSalary(int bs){
        return this.base = bs;
    }
}

