public class Barang {
    private String name;
    private int price;
    private int stock = 20;

    Barang(String name, int price){
        this.name = name;
        this.price = price;
    }
    String getName(){
        return name;
    }
    int gePrice(){
        return price;
    }
    int getStock(){
        return stock;
    }
    public void setStock(int stock){
        this.stock = stock;
    }
    public void reduceStock(int amount){
        if(stock >= amount){
            stock -= amount;
            System.out.println(amount + " " + name + "terjual.");
        } else{
            System.out.println("Stok " + name + " tidak mencukupi.");
        }
    }
}
