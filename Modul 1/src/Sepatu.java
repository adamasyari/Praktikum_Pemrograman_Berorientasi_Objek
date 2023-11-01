public class Sepatu extends Barang{
    private int shoeSize;

    public Sepatu(String name, int price, int shoeSize){
        super(name, price);
        this.shoeSize = shoeSize;
    }
    public int getShoeSize(){
        return shoeSize;
    }
    @Override
    public void reduceStock(int amount){
        if(getStock() >= amount){
            setStock(getStock() - amount);
            System.out.println(amount + " " + getName() + " (Ukuran " + shoeSize + ") terjual.");
        } else {
            System.out.println("Stok " + getName() + " (Ukuran " + shoeSize + ") tidak mencukupi.");
        }
    }
}
