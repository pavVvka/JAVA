package Task_10_2_CW_;
//https://www.codewars.com/kata/5a2be17aee1aaefe2a000151/train/java
// I'm new to coding and now I want to get the sum of two arrays...
// Actually the sum of all their elements. I'll appreciate for your help.
//
//P.S. Each array includes only integer numbers. Output is a number too.
// Получается только для равных длин массивов!!!

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Array_plus_array {
    public static void main(String[] args) {
//        int[] a2 = {1, 1};
        int[] a1 = {1, 2, 3, 4};
        int[] a2 = {1, 2, 3, 4};
        System.out.println(arrayPlusArray(a1, a2));


    }

    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        // arr1 + arr2 is not working...
        int summa = 0;
        for (int i = 0; i < arr1.length || i < arr2.length; i++) {
            summa += arr1[i] + arr2[i];
        }

        return summa;

//  вариант из бест практис:
//        return IntStream.of(arr1).sum() + IntStream.of(arr2).sum();


    }
}
