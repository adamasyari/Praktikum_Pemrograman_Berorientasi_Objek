import java.util.ArrayList;

public class User {
    private String name;
    private double saldo;
    ArrayList<Order>orders = new ArrayList<Order>();

    User(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void isiSaldo(double jumlah){
        if(jumlah >= 50000){
            saldo += jumlah;
            System.out.println(getName() + " Saldo berhasil diisi sebesar Rp." + saldo + "\n");
        } else {
            System.out.println(getName() + " Pengisian saldo gagal. Jumlah minimal pangisian saldo adalah Rp50,000\n");
        }
    }
    public void minSaldo(double jumlah){
        saldo -= jumlah;
    }
    public double getSaldo(){
        return saldo;
    }
    public void addToOrder(Barang product, int amount){
        orders.add(new Order(product, amount));
    }
    public void payOrder(Bank bank){
        double totalBill = 0;
        for(Order order : orders){
            totalBill += order.getTotalPrice();
        }
        System.out.println("\nNOTA " + name);
        if (bank.isActive()) {
            System.out.println("Bank Digunakan: " + bank.getName());
            if (bank.getBankDiscount() > 0) {
                System.out.println("Diskon bank: " + bank.getBankDiscount() + "%");
            }

            for (Order order : orders) {
                System.out.println(order.getBarang().getName() + " x " + order.getAmount() +" = Rp" + order.getTotalPrice());
            }

            System.out.println("Total belanja sebelum diskon: Rp" + totalBill);

            if (bank.getBankDiscount() > 0) {
                double discount = (totalBill * bank.getBankDiscount()) / 100;
                totalBill -= discount;
                System.out.println("Total belanja setelah diskon: Rp" + totalBill);
            }
            
            if (saldo >= totalBill) {
                saldo -= totalBill;
                System.out.println("Sisa saldo: Rp" + saldo);
                for (Order order : orders) {
                    order.getBarang().reduceStock(order.getAmount());
                }
            } else {
                System.out.println("Pembayaran gagal. Saldo tidak mencukupi.");
            }
        } else {
            System.out.println("Bank Digunakan: " + bank.getName());
            System.out.println("Pembayaran tidak dapat diproses karena bank tidak aktif.");
        }
    }
}
