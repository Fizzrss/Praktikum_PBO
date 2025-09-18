public class Pelanggan {
    private String idPelanggan;
    private String namaPelanggan;
    private String noHp;

    public Pelanggan(String id, String nama, String noHp){
        idPelanggan = id;
        namaPelanggan = nama;
        this.noHp = noHp;
    }

    public String getIdPelanggan() {
        return idPelanggan;
    }

    public void setIdPelanggan(String idPelanggan) {
        this.idPelanggan = idPelanggan;
    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public void setNamaPelanggan(String namaPelanggan) {
        this.namaPelanggan = namaPelanggan;
    }

    public String getNoHp() {
        return noHp;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    public String getInfo(){
        String info = "";
        info += "ID Pelanggan      : " + this.idPelanggan + "\n";
        info += "Nama Pelanggan    : " + this.namaPelanggan + "\n";
        info += "Nomer HP          : " + this.noHp;

        return info;
    }
}
