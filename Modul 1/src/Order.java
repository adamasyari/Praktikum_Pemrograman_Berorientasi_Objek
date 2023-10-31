public class Order {
    private Barang barang;
    private int amount;

    Order(Barang barang, int amount){
        this.barang = barang;
        this.amount = amount;
    }
    int getTotalPrice(){
        return barang.gePrice() * amount;
    }
    public Barang getBarang(){
        return barang;
    }
    public int getAmount(){
        return amount;
    }
    void printNota(){
        System.out.println("Barang: " + barang.getName());
        System.out.println("Jumlah: " + amount);
        System.out.println("Harga Total: " + getTotalPrice());
    }
}
