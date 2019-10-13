package list4;
import java.util.Scanner;
public class BattleFieldMain {

    public static void main(String[] args) {
        Skill fireBall = new Skill ("Fireball", 60, 30);
        Skill fireSurge = new Skill ("Firesurge", 40, 20);

        Hero batman = new Hero("Batman");
        Hero deadpool = new Hero("Deadpool");
        Hero samus = new Hero("Samus");

        //Round1
        samus.takeDamage(50);
        deadpool.takeDamage(90);
        batman.spendMana(50);
        System.out.println(samus);
        System.out.println(deadpool);
        System.out.println(batman);

        //round2
        deadpool.healHp(50);
        batman.spendMana(60);
        samus.takeDamage(40);
        System.out.println(samus);
        System.out.println(deadpool);
        System.out.println(batman);

        //round3
        samus.spendMana(100);
        deadpool.takeDamage(80);
        batman.takeDamage(80);
        System.out.println(samus);
        System.out.println(deadpool);
        System.out.println(batman);
    }
}
