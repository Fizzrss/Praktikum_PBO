package tugas;

public abstract class Makanan {
    public String nama;
    public int harga;

    public Makanan(String nama, int harga){
        this.nama = nama;
        this.harga = harga;
    }

    public abstract void menyajikan();

    public void getInfo(){
        System.out.println("Nama Makanan : " + this.nama);
        System.out.println("Harga        : " + this.harga);
    }
}
