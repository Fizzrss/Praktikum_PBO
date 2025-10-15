package tugas;

public class BukuPelajaran extends Buku{
    public String mataPelajaran;
    public String tingkatKelas;

    public BukuPelajaran(){

    }
    
    public BukuPelajaran (String judul, String pengarang, String tahunTerbit, int harga, int stok, String mataPelajaran, String tingkatKelas){
        super(judul, pengarang, tahunTerbit, harga, stok);
        this.mataPelajaran = mataPelajaran;
        this.tingkatKelas = tingkatKelas;
    }

    public void infoBukuPelajaran(){
        System.out.println("Mata Pelajaran : " + mataPelajaran);
        System.out.println("Tingkat Kelas  : " + tingkatKelas); 
    }

    // overiding dengan class Buku (parent class)
    public void getInfo(){
        super.getInfo();
        infoBukuPelajaran();
    }
}
