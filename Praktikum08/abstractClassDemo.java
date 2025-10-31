public class abstractClassDemo {
    public static void main(String[] args) {
        System.out.println("=== Class Lebah ===");
        Lebah lebah1 = new Lebah("Ratu", 0.05, "Nektar", "Hutan");
        lebah1.cetakInfo();
        System.out.println("--- cara bergerak ---");
        lebah1.bergerak();
        System.out.println("--- cara bernapas ---");  
        lebah1.bernapas();

        System.out.println("\n=== Class Ular ===");
        Ular ular1 = new Ular(true, 2.5, "Tikus", "Hutan");
        ular1.cetakInfo();
        System.out.println("--- cara bergerak ---");
        ular1.bergerak();
        System.out.println("--- cara bernapas ---");  
        ular1.bernapas();
    }
}
