package Task_10_3_CW_;
// https://www.codewars.com/kata/56bc28ad5bdaeb48760009b0/solutions/java
public class Remove_1_and_Last_Char {
    public static void main(String[] args) {
        String txt = "Wsdsa fd e skj";
        System.out.println(remove(txt));

    }
    public static String remove(String str) {

        // your code here
        int len = str.length();
        String n = "";
        for (int i = 1; i < len - 1; i++) {
            n += str.charAt(i);
        }
        return n;
// return str.substring(1, str.length() - 1);
    }
}
