package Task_8_2_1;




//поиск наибольшей зарплаты в массиве

//поиск наибольшего количества подчиненных в массиве менеджеров
//поиск наибольшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров
//поиск наименьшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров
public class EmployeeOptions {
    // поиск сотрудника в массиве по его имени
    public int indxByName(String name, Employee [] dataList){
        for (int i = 0; i < dataList.length; i++) {
            if(name.equals(dataList[i].getName())){
                return i;
            }
        }
        return -1;
    }

//поиск сотрудника в массиве по вхождению указанной строки в его имени
    public String nameByLetters(String letters, Employee[] dataList){
        for (int i = 0; i < dataList.length; i++) {
            if(dataList[i].getName().contains(letters)){
                return dataList[i].getName();
            }
        }
        return "not presents";
    }
//подсчет зарплатного бюджета для всех сотрудников в массиве
    public int salaryBudget(Employee[] dataList){
        int sumSalary = 0;
        for (int i = 0; i < dataList.length; i++) {
            sumSalary += dataList[i].getBaseSalary();
        }
        return sumSalary;
    }
//поиск наименьшей зарплаты в массиве
    public int minSalaryInData(Director[] dataList){
        int mi = Integer.MAX_VALUE;
        for (int i = 0; i < dataList.length; i++) {
            if(dataList[i].getSalaryDirector() < mi){
                mi = dataList[i].getSalaryDirector();
            }
        }
        return mi;
    }
//поиск наименьшего количества подчиненных в массиве менеджеров
    public int qttyManagers(Manager[] dataList){
        int qtty = 0;
        for(int i = 0; i < dataList.length; i++){
            qtty += 1;
        }
        return qtty;
    }



}



