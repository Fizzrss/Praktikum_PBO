public class Produk {
    private String idProduk;
    private String namaProduk;
    private int harga;

    public Produk(String id, String nama, int harga){
        idProduk = id;
        namaProduk = nama;
        this.harga = harga;
    }

    public String getIdProduk() {
        return idProduk;
    }

    public void setIdProduk(String idProduk) {
        this.idProduk = idProduk;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getInfo(){
        String info = "";
        info += "ID Produk      : " + this.idProduk + "\n";
        info += "Nama Produk    : " + this.namaProduk + "\n";
        info += "Harga Produk   : " + this.harga;

        return info;
    }
}
