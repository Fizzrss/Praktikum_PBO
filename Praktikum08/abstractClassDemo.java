public class abstractClassDemo {
    public static void main(String[] args) {
        Hewan hewan1 = new Lebah("Pekerja", 0.1, "Nektar", "Sarang");
        hewan1.cetakInfo();
        hewan1.bergerak();
        hewan1.bernapas();

        Lebah lebah1 = new Lebah("Ratu", 0.15, "Nektar", "Hutan");
        lebah1.cetakInfo();
        lebah1.bergerak();
        lebah1.bernapas();
    }
}
