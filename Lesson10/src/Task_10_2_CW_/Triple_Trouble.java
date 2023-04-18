package Task_10_2_CW_;

import java.util.Arrays;

//https://www.codewars.com/kata/5704aea738428f4d30000914/train/java
// Create a function that will return a string that combines
// all the letters of the three inputted strings in groups.
// Taking the first letter of all the inputs and grouping
// them next to each other. Do this for every letter
public class Triple_Trouble {
    public static void main(String[] args) {
//        tripleTrouble("aa", "bb", "cc");
        System.out.println(tripleTrouble("ad", "be", "cf"));

    }
    public static String tripleTrouble(String one, String two, String three) {
        // Solution
        String first = Arrays.toString(one.split(""));
        System.out.println("a>s " + Arrays.toString(one.split("")));
        System.out.println("first: " + first);
        System.out.println(one.length());

        String result = "";
        for (int i = 0; i < one.length(); i++) {
            result += "" + one.charAt(i) + two.charAt(i) + three.charAt(i);
            System.out.println("> " + one.charAt(i) + two.charAt(i) + three.charAt(i));
        }
        System.out.println("res: " + result);


        return result;
    }

}
