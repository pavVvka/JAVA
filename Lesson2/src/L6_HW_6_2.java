public class L6_HW_6_2 {
    public static void main(String[] args) {
        // 1
        System.out.println("1) Вывести все буквы 'о' заданной строки");
        String s = "Перестановочный алгоритм быстрого действия";
        char [] s1 = s.toCharArray();
        for (int i = 0; i < s1.length; i++) {
            if (s1[i] == 'о') {
                System.out.print(s1[i]);
            }
        }

        // 1.1.  Вариант от Сергея:
        System.out.println();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'о') {
                System.out.print('*');
            }

        }


        // 2
        System.out.println("\n\n2)  подсчитать количество букв “е” в строке");
        String s2 = "Перевыборы выбранного президента";
        char [] s2a = s2.toCharArray();
        int sum2 = 0;
        for (int i = 0; i < s2a.length; i++) {
            if (s2a[i] == 'е') {
                sum2++;
            }
        }
        System.out.println(sum2);

        // 3
        System.out.println("\n\n3)   вывести индексы начала всех подстрок - “рит”");
        String s3 = "Посмотрите как Рите нравится ритм";
//        String s3 = " ";
        s3 = s3.toLowerCase();
        char [] s3a = s3.toCharArray();
        for (int i = 0; i < s3a.length - 2; i++) {
            if (s3a[i] == 'р' & s3a[i + 1] == 'и' & s3a[i + 2] == 'т') {
                System.out.print(i + " ");
            }
        }

        // 3.1.  Вариант от Сергея:
        System.out.println();
        System.out.println("3.1.) Вариант от Сергея:");
        int index = s3.indexOf("рит");  // если не найдёт, то вернёт значение -1
        while (index != -1) {
            System.out.print(index);
            index = s3.indexOf("рит", index + 1);
        }




        // 4
        System.out.println("\n\n4)  Количество строк в массиве, которые не содержат буквы 'е'");
        String[][] array = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (!array[i][j].contains("е")){
                    counter++;
                }
            }
        }
        System.out.println("строк c буквой 'е'в массиве = " + counter);

    }
}
