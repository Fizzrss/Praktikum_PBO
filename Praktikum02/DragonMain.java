public class DragonMain {
    public static void main(String[] args) {
        System.out.println("===== Informasi DIrection Dragon =====");
        System.out.println("1 = Atas");
        System.out.println("2 = Kanan");
        System.out.println("3 = Bawah");
        System.out.println("4 = Kiri");
        System.out.println("======================================");

        
        
        System.out.println("\n========== Dragon 1 ==========");
        System.out.println("---- Status Awal ----");
        Dragon dragon1 = new Dragon(0, 0, 1);
        dragon1.printStatus();
        System.out.println("---- Bergerak 2 langkah ----");
        dragon1.move(2);
        dragon1.printStatus();
        System.out.println("---- Berubah arah ke bawah ----");
        dragon1.changeDirection(3);
        dragon1.printStatus();
        System.out.println("---- Bergerak 4 langkah ----");
        dragon1.move(4);
        dragon1.printStatus();
        System.out.println("---- Berubah arah ke kiri dan bergerak 3 langkah ----");
        dragon1.changeDirection(4);
        dragon1.move(3);
        dragon1.printStatus();
        
        System.out.println("\n========== Dragon 2 ==========");
        System.out.println("---- Status Awal ----");
        Dragon dragon2 = new Dragon(3, 2, 2);
        dragon2.printStatus();
        System.out.println("---- Bergerak 5 langkah ----");
        dragon2.move(5);
        dragon2.printStatus();
        System.out.println("---- Berubah arah ke atas dan bergerak 3 langkah ----");
        dragon2.changeDirection(1);
        dragon2.move(3);
        dragon2.printStatus();

        // jika method move() dipanggil persis setelah objek diinstansiasi
        System.out.println("\n========== Dragon 3 =========="); 
        Dragon dragon3 = new Dragon(0, 0, 0);
        dragon3.move(2);
        dragon3.printStatus();
    }
}
