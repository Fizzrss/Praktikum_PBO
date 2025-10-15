package tugas;

public class Buku {
    public String judul;
    public String pengarang;
    public String tahunTerbit;
    public int harga;
    public int stok;

    public Buku(){

    }

    // overloading constructor
    public Buku(String judul, String pengarang, String tahunTerbit, int harga, int stok){
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
        this.harga = harga;
        this.stok = stok;
    }

    public void tambahStok(int jumlah){
        this.stok += jumlah;
    }

    public void kurangiStok(int jumlah){
        if (this.stok >= jumlah) {
            this.stok -= jumlah;
        } else {
            System.out.println("Stok tidak bisa dikurangi");
        }
    }

    public void getInfo(){
        System.out.println("Judul          : " + judul);
        System.out.println("Pengarang      : " + pengarang);
        System.out.println("Tahun Terbit   : " + tahunTerbit);
        System.out.println("Harga          : " + harga);
        System.out.println("Jumlah Stok    : " + stok);
    }
}
