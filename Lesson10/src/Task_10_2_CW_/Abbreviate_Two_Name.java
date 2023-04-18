package Task_10_2_CW_;

import java.util.Arrays;

// https://www.codewars.com/kata/57eadb7ecd143f4c9c0000a3/train/java
// Write a function to convert a name into initials.
// This kata strictly takes two words with one space in between them.
//
//The output should be two capital letters with a dot separating them.
public class Abbreviate_Two_Name {
    public static void main(String[] args) {
        System.out.println(abbrevName("patrick feeney"));
    }
    public static String abbrevName(String name) {
//        int n = name.indexOf(" ") + 1;
//        char letter2 = name.charAt(n);
        char letter2 = name.charAt(name.indexOf(" ") + 1);
//        System.out.println("space > " + letter2);
        String abbr = name.charAt(0) + "." + letter2;
        return abbr.toUpperCase();
    }

}
