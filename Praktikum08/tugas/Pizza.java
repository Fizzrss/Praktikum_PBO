package tugas;

public class Pizza extends Makanan {
    public String topping;
    public String ukuran;
    
    public Pizza(String nama, int harga, String topping, String ukuran){
        super(nama, harga);
        this.topping = topping;
        this.ukuran = ukuran;
    }

    @Override
    public void menyajikan(){
        System.out.println("Disajikan dengan ukuran " + this.ukuran + " dan topping " + this.topping);
    }
}
