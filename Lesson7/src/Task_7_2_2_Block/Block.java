package Task_7_2_2_Block;

import Task_7_1.Employee;

public class Block {
//    public final int[] array;

    private int width;
    private int length;
    private int height;
    // Good Luck!
    public Block(int[] params){
            this.width = params[0];
            this.length = params[1];
            this.height = params[2];
    };
    int getWidth(){
        return width;
    }

    int getLength(){
        return length;
    }

    int getHeight(){
        return height;
    }

    int getVolume(){
        return width * length * height;
    }

    int getSurfaceArea(){
        return 2 * (width * length + width * height + length * height);
    }

    public static class L7_YW_7_3_Block {
        public static void main(String[] args) {
//            Employee[] employeeArray = {user1, user2};
            Block b1 = new Block(new int[]{10, 23, 11});
//            Block[] b1 = {this.width, length, height};
            System.out.println(b1);
            System.out.println(b1.getLength());
            System.out.println(b1.getSurfaceArea());
            System.out.println(b1.getVolume());

        }
    }
}

