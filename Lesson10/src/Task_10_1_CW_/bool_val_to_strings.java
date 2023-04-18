package Task_10_1_CW_;
// https://www.codewars.com/kata/53369039d7ab3ac506000467/train/java
// Complete the method that takes a boolean value and
// return a "Yes" string for true, or a "No" string for false.
public class bool_val_to_strings {
    public static void main(String[] args) {
        boolean x = true;
        boolean y = false;
        System.out.println(bool_val_to_strings.YesOrNo.boolToWord(x));
    }

    static class YesOrNo {
        public static String boolToWord(boolean b) {
            //TODO
            if (b) {
                return "Yes";
            }
            return "No";

        }
    }


}

