public class Demo {
    public static void main(String[] args) {
        Dosen dosen1 = new Dosen("19940201", "Widia, S.Kom. M.kom", "199402");
        TenagaKependidikan tendik1 = new TenagaKependidikan("19750301", "Aida, A.Md.", "Tenaga Administrasi");

        // System.out.println("=== Donwcasting Pegawai ke Dosen ===");
        // Pegawai pegawai1 = new Pegawai("20000101", "Budi, S.Pd.");
        // Dosen dosen2 = (Dosen) pegawai1;

        train(dosen1);
        train(tendik1);

    }
    public static void train(Pegawai pegawai) {
        pegawai.displayInfo();
        System.out.println("Mengenalkan lingkungan kampus");
        System.out.println("Menginfokan SOP/Juknis");

        if (pegawai instanceof Dosen) {
            System.out.println("Memberikan pelatihan pedagogik");
        }
    }
}
