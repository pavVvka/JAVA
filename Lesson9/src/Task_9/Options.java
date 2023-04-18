package Task_9;

import java.lang.reflect.Array;

public class Options {
    public static String findByName(String name, Employee[] list){
        for (int i = 0; i < list.length; i++) {
            if(name.equals(list[i].getName())){
                return name;
            }
        }
        return "no this name";
    }
// поиск наименьшего количества подчиненных в массиве менеджеров
    public static int minQtty(Employee[] lst){
        int minQ = Integer.MAX_VALUE;
        for (int i = 0; i < lst.length; i++) {
            if(((Manager)lst[i]).getNumberOfSubordinates() < minQ){
                minQ = ((Manager) lst[i]).getNumberOfSubordinates();
            }

        }
        return minQ;
    }
// подсчет зарплатного бюджета для всех сотрудников в массиве
    public static int budgetSum(Employee[] lst){
        int sum = 0;
        for (int i = 0; i < lst.length; i++) {
            sum += lst[i].getSalary();
        }
        return sum;
    }
// выдать все зарплаты сотрудников из массива
    public static void salaryList(Employee[] lst){
        for (int i = 0; i < lst.length; i++) {
            System.out.println(lst[i].getName() + " " + lst[i].getSalary());

        }
    }


}
