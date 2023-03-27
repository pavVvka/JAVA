public class L5_HW_1 {
    public static void main(String[] args) {

        System.out.println("Задача №1   ");
        for (int i = 0; i < 10 ; i++) {
            System.out.println();
            for (int j = 0; j < 10 - i; j++) {
                System.out.print(j + " ");
            }
        }
//        Решение Сергея
//        for (int i = 10; i >= 0 ; i--) {
//            System.out.println();
//            for (int j = 0; j < i; j++) {System.out.print(j + " ");}}


        System.out.println("\n\nЗадача №2   ");
        String txt = " ";
        for (int i = 0; i < 10; i++){
            System.out.println();
            for (int k = i * 2; k > 0; k--) {System.out.print(txt);}
            for (int j = 0; j < 10 - i; j++){System.out.print(j + " ");}
          }

        System.out.println("\n\nЗадача №3   ");
        String txt2 = " ";
        for (int i = 0; i < 10; i++){
            System.out.println();
            for (int k = i * 2; k > 0; k--) {System.out.print(txt2);}
            for (int j = 9 - i; j > 0; j--){System.out.print(j + " ");}
            for (int j = 0; j < 10 - i; j++){System.out.print(j + " ");}
        }

        // объявление массива
        int [] a = new int[1];
        a[0] = 1000;
        System.out.println("\n\n" + a[0]);

        // объявление строкового массива
        char [] s1 = "Привет".toCharArray();
        char [] s2 = new char[]{'P', 'r', 'i'};
        char [] s3 = new char[6];
        s3[0] = 'П';
        s3[1] = 'р';
        s3[2] = 'и';
        s3[3] = 'в';
        s3[4] = 'е';
        s3[5] = 'т';

        for (int i = 0; i < s1.length; i++) {
            System.out.print(s1[i]);

        }

        //  вложенный массив
        System.out.println("\n\nвложенный массив. вар 1 по индексам");
        int [] [] b = new int[3][10];
        System.out.println(b.length);
        for (int i = 0; i < b.length; i++) {
            int [] c = b[i];
            System.out.println(' ');
            for (int j = 0; j < c.length; j++){
                System.out.print(c[j]);
            }
        }
        System.out.println("\n\nвложенный массив. вар. 2 по индексам");
        int [] [] b1 = new int[3][10];
        System.out.println(b1.length);
        for (int i = 0; i < b1.length; i++) {
//            int [] c = b[i];
            System.out.println(' ');
            for (int j = 0; j < b1[i].length; j++){
                System.out.print(b1[i][j]);
            }
        }

        System.out.println("\n\nвложенный строковый массив. вар. 3");
        char [] [] bb = new char[3][10];
        bb[0] = "Привет ".toCharArray();
        bb[1] = "массивушка ".toCharArray();
        bb[2] = "родной!".toCharArray();

        System.out.println(bb.length);
        for (int i = 0; i < bb.length; i++) {
            System.out.println("\n>> строка № " + i);
            for (int j = 0; j < bb[i].length; j++){
                System.out.print(bb[i][j]);
            }
        }
}}
