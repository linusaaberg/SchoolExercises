package list4;

public class Skill {

    private String skillName;
    private double damage;
    private int manaCost;

    public Skill ( String skillName, double damage, int manaCost){
        this.skillName = skillName;
        this.damage = damage;
        this.manaCost = manaCost;
    }

    public String getSkillName(){
        return this.skillName;
    }

    public int getManaCost(){
        return this.manaCost;
    }

    public double getDamage() {
        return damage;
    }

    public void useSkill(){
        System.out.println(this.skillName + " does " + this.damage + " damage. (Costs " + this.manaCost + " mana)");

    }
}
