package Task_10_1_CW_;
// https://www.codewars.com/kata/57356c55867b9b7a60000bd7/train/java
// Your task is to create a function that does four basic mathematical operations.
//The function should take three arguments - operation(string/char), value1(number), value2(number).
//The function should return result of numbers after applying the chosen operation.
public class Basic_Math_Operations {
    public static void main(String[] args) {
        int v1 = 5;
        int v2 = 0;
        System.out.println(BasicOperations.basicMath("/", v1, v2));


    }
    public static class BasicOperations
    {
        public static Integer basicMath(String op, int v1, int v2)
        {
            if(v2 == 0){
                return 0;
            }
            if(op.equals("+")){
                return v1 + v2;
            } else if (op.equals("-")) {
                return v1 - v2;
            } else if (op.equals("*")) {
                return v1 * v2;
            } else if (op.equals("/")) {
                return v1 / v2;
            }
            return -1;
        }
    }
}
