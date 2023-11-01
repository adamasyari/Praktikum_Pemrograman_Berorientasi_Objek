public class Baju extends Barang{
    private String size;

    public Baju(String name, int price, String size){
        super(name, price);
        this.size = size;
    }
    public String getSize(){
        return size;
    }
    @Override
    public void reduceStock(int amount){
        if(getStock() >= amount){
            setStock(getStock() - amount);
            System.out.println(amount + " " + getName() + " (" + size + ") terjual");
        } else {
            System.out.println("Stok " + getName() + " (" + size + ") tidak mencukupi");
        }
    }
}
