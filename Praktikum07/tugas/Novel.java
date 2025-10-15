package tugas;

public class Novel extends Buku {
    public String genre;

    public Novel(){

    }

    public Novel(String judul, String pengarang, String tahunTerbit, int harga, int stok, String genre){
        super(judul, pengarang, tahunTerbit, harga, stok);
        this.genre = genre;
    }
    
    public void infoNovel(){
        System.out.println("Genre          : " + genre);
    }

    // overide dengan class Buku (parent class)
    public void getInfo(){
        super.getInfo();
        this.infoNovel();
    }
}
