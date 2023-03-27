package Task_7_1;

public class L7_HW_7_1 {
    public static void main(String[] args) {
//        Задача №1
//        Необходимо создать класс Person с полями: имя, возраст, пол.
//        Класс должен иметь метод - getName, метод возвращает имя с префиксом “Mr. ”
//        если пол указан как мужской и префикс “Mrs. ” если женский


        Person pk = new Person();
        Person an = new Person();

//        pk.name = "Pavel";
        an.name = "Anna";
        pk.gender = "malchik";
        an.gender = "women";

        System.out.println(pk.getName());
        System.out.println(an.getName());

//        Задача №2
//        Необходимо создать класс Employee с полями как у Person (из предыдущего задания)
//        и поле зарплата. Класс должен иметь метод isSameName(Employee employee)
//        который возвращает true, если у сотрудника у которого был вызван метод и сотрудника
//        который был передан как параметр, одинаковое имя.
        Employee user1 = new Employee();
        user1.name = "Olya";
        user1.salary = 200;
        Employee user2 = new Employee();
        user2.name = "Olya";
        user2.salary = 300;
        System.out.println(user1.name);
        System.out.println(user1.isSameName(user2));
//        Задача №3
//        Необходимо создать класс Salary с единственным методом - getSum(Employee[] employeeArray),
//        метод должен возвращать сумму зарплат всех сотрудников из массива
//        переданного в качестве аргумента вызова метода
        System.out.println("\nЗадача №3\n");

        Employee[] employeeArray = {user1, user2};
        Salary summa = new Salary();
        System.out.println(summa.getSum(employeeArray));
//        System.out.println(summa.getSum(Employee[] employeeArray));
    }
}
