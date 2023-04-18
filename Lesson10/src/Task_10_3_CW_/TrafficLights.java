package Task_10_3_CW_;
// https://www.codewars.com/kata/58649884a1659ed6cb000072/train/java
public class TrafficLights {
    public static void main(String[] args) {
        String color = "red";
        System.out.println(updateLight(color));

    }
    public static String updateLight(String current) {
        String[] lights = {"green", "yellow", "red", "green"};
        for (int i = 0; i < lights.length; i++) {
            if (current.equals(lights[i])){
                return lights[i + 1];  // return next[(i+1)%3];
            }
        }

        return "";
    }
}
