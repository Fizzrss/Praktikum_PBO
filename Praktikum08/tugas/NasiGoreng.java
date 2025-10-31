package tugas;

public class NasiGoreng extends Makanan {
    public  String levelPedas;

    public NasiGoreng(String nama, int harga, String levelPedas){
        super(nama, harga);
        this.levelPedas = levelPedas;
    }

    @Override
    public void menyajikan(){
        System.out.println("Disajikan dengan level " + this.levelPedas);
    }
}
