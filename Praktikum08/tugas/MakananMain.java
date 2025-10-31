package tugas;

public class MakananMain {
    public static void main(String[] args) {
        System.out.println("=== Nasi Goreng ===");
        NasiGoreng nasiGoreng = new NasiGoreng("Nasi Goreng Spesial", 20000, "Pedas");
        nasiGoreng.getInfo();
        nasiGoreng.menyajikan();
        
        System.out.println("\n=== Pizza ===");
        Pizza pizza = new Pizza("Pizza Margherita", 50000, "Keju Mozzarella", "Medium");
        pizza.getInfo();
        pizza.menyajikan();
    }
}
