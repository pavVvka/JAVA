package Task_8_2_1;
// Задача №1
//
//Необходимо создать класс Employee со следующими методами:
//getName - получить имя
//setName
//getBaseSalary - базовая ставка
//setBaseSalary
public class Task821 {
    public static void main(String[] args) {
        Employee van_E = new Employee("Vanya", 100);
        Employee pet_E = new Employee("Petya", 100);
        Employee mih_E = new Employee("Misha", 100);
        Manager das_M = new Manager("Darya", 150, 2);
        Manager reg_M = new Manager("Regina", 150/4, 2);
        Director ann_D = new Director("Anna", 200, 3);
        Director kat_D = new Director("Katya", 250, 0);

        System.out.print( "Directors :\n" +
                kat_D.getName() + " " + kat_D.getSalaryDirector() + "\n" +
                        ann_D.getName() + " " + ann_D.getNumberOfSubordinates() + " " + ann_D.getSalaryDirector() +"\n"

        );
        System.out.print( "Managers :\n" +
                das_M.getName() + " " + das_M.getSalaryManager() + "\n" +
                reg_M.getName() + " " + reg_M.getNumberOfSubordinates() + " " + reg_M.getSalaryManager() +"\n\n\n"

        );
        Employee[] dataE = new Employee[]{van_E, pet_E, mih_E};

        ;
        System.out.println("> Budget: \n");
        System.out.println();
// здесь надо как то вывести .salaryBudget из EmployeeOptions

    }
}

