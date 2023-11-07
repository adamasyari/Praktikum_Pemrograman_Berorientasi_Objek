public abstract class Entity {
    String name;
    int health, attack, defence;

    public void setName(String name) {
        this.name = name;
    }
    public abstract void showEntity();
}
