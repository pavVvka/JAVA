public class Main {
    public static void main(String[] args) {

        Person_test pavel = new Person_test();
        Person_test anna = new Person_test();
        pavel.age = 52;
        pavel.name = "Pavidlo";
        anna.name = "AnnA";
        anna.age = 36;

        System.out.println(pavel.name);
        System.out.println(pavel.getInfo());

    }
}