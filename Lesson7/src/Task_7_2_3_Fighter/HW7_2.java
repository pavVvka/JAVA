package Task_7_2_3_Fighter;

public class HW7_2 {
    public static void main(String[] args) {
        Fighter fighter1 = new Fighter("Lew", 10, 2);
        Fighter fighter2 = new Fighter("Harry", 5, 4);
        String firstAttacker = fighter2.name;
        String win = declareWinner(fighter1, fighter2,firstAttacker);
        System.out.println(win + " wins!!");
    }
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        Fighter f1, f2;
        if (firstAttacker.equals(fighter2.name)) {
            f1 = fighter2;
            f2 = fighter1;
        } else {
            f2 = fighter2;
            f1 = fighter1;
        }

        while (true) {
            f1.health -= f2.damagePerAttack;
            System.out.println(f2.name + " hits " + f1.name + "   HP = " + f2.health);

            if (f1.health <= 0) {
                return f2.name;
            }

            f2.health -= f1.damagePerAttack;
            System.out.println(f1.name + " hits " + f2.name + "   HP = " + f1.health);

            if (f2.health <= 0) {
                return f1.name;
            }
        }
    }
}
