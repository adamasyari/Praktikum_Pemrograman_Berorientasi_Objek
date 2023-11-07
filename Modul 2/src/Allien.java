public class Allien extends Entity implements Behavior{
    int count = 0;

    public Allien(String name, int health, int attack, int defence){
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.defence = defence;
    }
    public void attack(Monster monster){
        int damage = this.attack - monster.defence;
        int damage2 = this.attack;
        count ++;

        if(count % 4 == 0){
            specialSkill(monster, damage2);
        } else {
            System.out.println("The alien " + this.name + " attacks " + monster.name + " with a normal attack!");
            monster.health -= damage;
        }
    }
    public void showHealth(Allien allien){
        System.out.println(this.name + " | " + this.health);
    }
    public void showEntity() {
        System.out.print("Alien: " + this.name + " | ");
        System.out.print("Health: " + this.health + " | ");
        System.out.print("Attack: " + this.attack + " | ");
        System.out.println("Defence: " + this.defence);
    }
    public void specialSkill(Monster monster, int damage){
        System.out.println("The Alien " + name + " attacks " + monster.name + " with special attack!");
        monster.health -= damage * 2;
    }
    public void dead(){
        System.out.println("The Monster Wins!");
        System.out.println("The alien " + this.name + " is dead!");
    }
    @Override
    public void specialSkill() {
        throw new UnsupportedOperationException("Unimplemented method 'specialSkill'");
    }
}
