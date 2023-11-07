public class Monster extends Entity implements Behavior{
    int count = 0;

    public Monster(String name, int health, int attack, int defence){
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.defence = defence;
    }
    public void attack(Allien allien){   
        int damage = this.attack - allien.defence;
        count ++;

        if((this.count % 3) == 0)
            specialSkill();
        else {
            System.out.println("The monster " + this.name + " attacks " + allien.name + " with a normal attack!");
            allien.health -= damage;
        }
    }
    public void showHealth(Monster monster){
        System.out.println(this.name + " | " + this.health);
    }
    public void showEntity() {
        System.out.print("Monster: " + this.name + " | ");
        System.out.print("Health: " + this.health + " | ");
        System.out.print("Attack: " + this.attack + " | ");
        System.out.println("Defence: " + this.defence);
    }
    public void specialSkill(){
        System.out.println("The monster use special skill");
        this.health = this.health + (this.health / 2);
    }
    public void dead(){
        System.out.println("The Alien Wins!");
        System.out.println("The monster " + this.name + " is dead!");
    }
}
