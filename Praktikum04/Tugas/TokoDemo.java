public class TokoDemo {
    public static void main(String[] args) {
        // inisialisasi produk
        Produk produk1 = new Produk("P001", "Sabun", 5000);
        Produk produk2 = new Produk("P002", "Shampo", 10000);
        Produk produk3 = new Produk("P003", "Deterjen", 12000);
        Produk produk4 = new Produk("P004", "Pasta Gigi", 20000);
        Produk produk5 = new Produk("P005", "Parfum", 50000);

        // inisialisasi pelanggan
        Pelanggan pelanggan1 = new Pelanggan("PE001", "Fiza Rahmatus", "089515890385");
        Pelanggan pelanggan2 = new Pelanggan("PE002", "Diyah Ramadhani", "082134657332");
        Pelanggan pelanggan3 = new Pelanggan("PE003", "Naswa Nida", "082133342467");
        Pelanggan pelanggan4 = new Pelanggan("PE004", "Amanda Dealova", "089543879901");
        Pelanggan pelanggan5 = new Pelanggan("PE005", "Gagah Irlangsa", "081235078923");

        // membuat toko ke-1
        Toko toko1 = new Toko("Bismillah");
        System.out.println("\n===== Informasi Toko " + toko1.getNamaToko() + " =====");
        toko1.tambahProduk(produk2);
        toko1.tambahProduk(produk1);
        toko1.tambahProduk(produk5);
        toko1.tampilkanProduk();
        
        toko1.tambahPelanggan(pelanggan2);
        toko1.tambahPelanggan(pelanggan5);
        toko1.tampilkanPelanggan();

        // membuat toko ke-2
        Toko toko2 = new Toko("Sumber Jaya Makmur");
        System.out.println("\n===== Informasi Toko " + toko2.getNamaToko() + " =====");
        toko2.tambahProduk(produk3);
        toko2.tambahProduk(produk4);
        toko2.tampilkanProduk();

        toko2.tambahPelanggan(pelanggan1);
        toko2.tambahPelanggan(pelanggan4);
        toko2.tambahPelanggan(pelanggan3);
        toko2.tampilkanPelanggan();
    }
}
