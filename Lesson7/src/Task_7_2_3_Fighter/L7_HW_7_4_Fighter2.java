package Task_7_2_3_Fighter;

public class L7_HW_7_4_Fighter2 {
    public static void main(String[] args) {
        Fighter agr = new Fighter("Lew", 10, 2);
        Fighter def = new Fighter("Harry", 5, 4);

        declare_winner(agr, def, "Lew");
        System.out.println(declare_winner(agr, def, "Lew") + " wins!!");
    }

    public static String declare_winner(Fighter agr, Fighter def, String arg){
        Fighter fa = agr, fd = def;
        if(arg.equals(def.name)){
            fa = def;
            fd = agr;

        }
        while(fa.health > 0 | fd.health > 0){
            fd.health -= fa.damagePerAttack;
            System.out.println(fa.name + " attacked " + fd.name + " :  fa.health = " + fa.health);
            fa.health -= fd.damagePerAttack;
            System.out.println(fd.name + " attacked " + fa.name + " :  fa.health = " + fd.health);

        }

        if (fa.health > fd.health){
            return fa.name;
        } else return fd.name;

    }
}
