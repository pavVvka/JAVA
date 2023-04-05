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

    public static int minQtty(Employee[] lst){
        int minQ = Integer.MAX_VALUE;
        for (int i = 0; i < lst.length; i++) {
            if(((Manager)lst[i]).getNumberOfSubordinates() < minQ){
                minQ = ((Manager) lst[i]).getNumberOfSubordinates();
            }

        }
        return minQ;
    }
}
