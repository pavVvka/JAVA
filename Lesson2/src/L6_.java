public class L6_ {
    public static void main(String[] args) {
        Integer a = 10;
        int b = 50;

        String c1 = "Hello";
        String c2 = c1;
        c2 = "hi";

        String s1 = "Hello";
        String s2 = s1;   // Здесь они хранят один объект
        s2 = "Hi";        //  Здесь уже разные объекты:   s1 = “Hello”      s2 = “Hi”
        String s3 = s1.toLowerCase();
        System.out.println(s1);  // Hello
        System.out.println(s3);  // hello

        int[] arr = {0, 5, 3, 8, 2, 6};

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) { max = arr[i]; }}
        System.out.println("Max = " + max);

}}
