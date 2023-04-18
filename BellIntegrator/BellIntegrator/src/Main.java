public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int x = 8;
        int y = 1;
//        y = y + 2 * x;
        System.out.println(y); // 17
//        x = x * 3;
        System.out.println(x); // 24
//        x = x * 16;
        System.out.println(x); // 384
//        y = y + 2 * x;
        System.out.println(y); // 785
        y = x - y;
        System.out.println(y); // -401

    }
}