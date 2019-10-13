package list4;

public class Hero {

    private String name;
    private int hp = 100;
    private int mana = 100;

    public Hero (String name){
        this.name = name;
    }

    public String toString (){
        String info = this.name + " has " + this.hp + " HP and " + this.mana + " mana";
        return info;
    }

    public String getName(){
        return this.name;
    }

    public int getHp(){
        return this.hp;
    }

    public int getMana(){
        return this.mana;
    }

    public void takeDamage(int damage){

        this.hp = this.hp - damage;
        if (this.hp <= 0){
            System.out.println("I died but i regret nothing!");
        }
    }

    public void spendMana(int manaSpent){

        this.mana = this.mana - manaSpent;
        if (this.mana < 0 ){
            this.mana = 0;
        }
    }

    public void healHp (int healHp){
        this.hp = this.hp + healHp;
    }

    public void replenishMana (){

        if (this.mana != 100) {
            this.mana = this.mana + 15;
        }
    }
}
