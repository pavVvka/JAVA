public class L7_HW_7_2_Cube {
//        получает одну единственную частную целочисленную переменную Side,
//        метод получения GetSide() и метод установки SetSide(int num)
//        для этого свойства.
public static void main(String[] args) {
    Cube cube1 = new Cube();
    System.out.println(cube1.getSide());
    cube1.setSide(20);
    System.out.println(cube1.getSide());
}
    public static class Cube{

    int side;
    int getSide(){
        return side;
    }
    void setSide(int num){
            side = num;
        }
}
}
