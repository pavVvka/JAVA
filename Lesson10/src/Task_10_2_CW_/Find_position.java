package Task_10_2_CW_;
// https://www.codewars.com/kata/5808e2006b65bff35500008f/train/java
// When provided with a letter, return its position in the alphabet
public class Find_position {
    public static void main(String[] args) {
        System.out.println(position('z'));

    }
    public static String position(char alphabet)
    {
        String al = " abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < al.length(); i++) {
            if(al.charAt(i) == alphabet){
                return "Position of alphabet: " + i;
            }
        }
        return "";
    }


}
