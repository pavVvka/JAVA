package Task_10_2_CW_;
//  возвращает массив из двух - поэлементным сложением!!!
import java.util.Arrays;

public class Array_plus_array_byElement {
    public static void main(String[] args) {
//        int[] a2 = {1, 1};
        int[] a1 = {1, 2, 3, 4};
        int[] a2 = {1, 2, 3, 4};
        System.out.println(Arrays.toString(arrayOfTwoArrays(a1, a2)));

    }
    public static int[] arrayOfTwoArrays(int[] arr1, int[] arr2) {

        int[] fix;

        if(arr2.length > arr1.length) {
            fix = new int[arr2.length];
            for (int i = 0; i < fix.length; i++) {
                if(i >= arr1.length){
                    fix[i] = arr2[i];
                } else fix[i] = arr1[i] + arr2[i];

            }
        } else {

            fix = new int[arr1.length];
            for (int i = 0; i < fix.length; i++) {
                if (i >= arr2.length) {
                    fix[i] = arr1[i];
                } else fix[i] = arr1[i] + arr2[i];
            }
        }
        return fix;
    }





}
