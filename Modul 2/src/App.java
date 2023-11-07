public class App {
    public static void main(String[] args) throws Exception {
        Monster monster = new Monster("Sally", 80, 20, 10);
        Allien allien = new Allien("Zograd", 80, 20, 10);

        monster.showEntity();
        allien.showEntity();

        System.out.println();
        System.out.println("Battle Start!");
        System.out.println();

        for(int i = 0 ; i < 16; i++){
            if(i % 2 != 0){
                allien.attack(monster);
                monster.showHealth(monster);
                allien.showHealth(allien);
                System.out.println();

                if(monster.health < 0){
                    monster.dead();
                }
                else if(allien.health < 0){
                    allien.dead();
                }
            } else {
                monster.attack(allien);
                monster.showHealth(monster);
                allien.showHealth(allien);
                System.out.println();

                if(monster.health < 0){
                    monster.dead();
                }
                else if(allien.health < 0){
                    allien.dead();
                }
            }
        }
    }
}
