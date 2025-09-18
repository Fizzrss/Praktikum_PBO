import java.util.ArrayList;

public class Toko {
    private String namaToko;
    private ArrayList<Produk> produkToko;
    private ArrayList<Pelanggan> pelangganToko;

    public Toko(String nama){
        namaToko = nama;
        this.produkToko = new ArrayList<Produk>();
        this.pelangganToko = new ArrayList<Pelanggan>();
    }

    public String getNamaToko() {
        return namaToko;
    }

    public void setNamaToko(String namaToko) {
        this.namaToko = namaToko;
    }

    public void tambahProduk(Produk p){
        produkToko.add(p);
    }

    public void tambahPelanggan(Pelanggan pelanggan){
        pelangganToko.add(pelanggan);
    }

    public void tampilkanProduk(){
        System.out.println("\n--- Daftar Produk yang dimiliki ---");
        int i = 0;
        for (Produk p : produkToko) {
            System.out.println("- Produk ke- " + (i+1));
            System.out.println(p.getInfo());
            i++;
        }
    }
    public void tampilkanPelanggan(){
        System.out.println("\n--- Daftar Pelanggan yang berkunjung ---");
        int i = 0;
        for (Pelanggan pelanggan : pelangganToko) {
            System.out.println("- Pelanggan ke- " + (i+1));
            System.out.println(pelanggan.getInfo());
            i++;
        }
    }
}
