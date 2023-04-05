package Task_9;

public class TaskMain {
    public static void main(String[] args) {

        Employee vanya = new Employee("Ivan", 100);
        Employee pasha = new Employee("Pavel", 100);
        Employee lesha = new Employee("Alex", 100);
        Worker w1 = new Worker("Denis", 120);
        Worker w2 = new Worker("vas", 100);
        w2.setName("Vasya");
        System.out.println(w2.getName() + w1.getSalary());

        Manager m1 = new Manager("Regina", 200, 3);
        System.out.println(m1.getName() + m1.getNumberOfSubordinates() + m1.getSalary());
//        m1.setNumberOfSubordinates(0);
        System.out.println(m1.getName() + m1.getSalary());
        Manager m2 = new Manager("Polina", 200, 4);

        Employee[] empList = new Employee[] {vanya, pasha, lesha};
        System.out.println(Options.findByName("pasha", empList));
        System.out.println(Options.findByName("Pavel", empList));

        Manager[] managList = {m1, m2};
        System.out.println(Options.minQtty(managList));

        empList = new Employee[] {m1, m2};
        System.out.println(Options.findByName("Lesha", empList));
        System.out.println("> " + Options.minQtty(empList));






    }
}
