package Task_10_3_CW_;

import java.util.Arrays;

public class Remove_String_Spaces {
    public static void main(String[] args) {
        String txt = "8 j 8   mBliB8g  imjB8B8  jl  B"; // -> "8j8mBliB8gimjB8B8jlB"
        System.out.println(noSpace(txt));

    }
    public static String noSpace(final String x) {
        return x.replaceAll(" ", "");
    }
}
