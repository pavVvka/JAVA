package Task_10_2_CW_;
//https://www.codewars.com/kata/5aa736a455f906981800360d/train/java
//  rule: the dish must start and end with the same letters as the animal's name.
// Write a function feast that takes the animal's name and dish
// as arguments and returns true or false to indicate whether
// the beast is allowed to bring the dish to the feast.

public class Feast_Many_Beasts {
    public static void main(String[] args) {
        String b = "cow yellow";
        String c = "cake swallow";
        System.out.println(b.charAt(0) + "&" + b.charAt(b.length() - 1));
        System.out.println(feast("cow yellow", "cake swallow"));

    }
    public static boolean feast(String beast, String dish) {
        if(beast.charAt(0) == dish.charAt(0) &
        beast.charAt(beast.length() - 1) == dish.charAt(dish.length() - 1)){
            return true;
        }

        return false;

    }


}
