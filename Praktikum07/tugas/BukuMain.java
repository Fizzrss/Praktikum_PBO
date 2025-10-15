package tugas;

import java.util.Scanner;

public class BukuMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Untuk Info Buku Pelajaran
        System.out.println("=========== Buku Pelajaran ==========");
        System.out.println("--- Masukkan data Buku Pelajaran ---");
        System.out.print("Judul: ");
        String judul = sc.nextLine();
        System.out.print("Pengarang: ");
        String pengarang = sc.nextLine();
        System.out.print("Tahun Terbit: ");
        String tahunTerbit = sc.nextLine();
        System.out.print("Harga: ");
        int harga = sc.nextInt();
        System.out.print("Jumlah Stok: ");
        int stok = sc.nextInt();
        sc.nextLine();
        System.out.print("Mata Pelajaran: ");
        String mataPelajaran = sc.nextLine();
        System.out.print("Kelas: ");
        String tingkatKelas = sc.nextLine();
        BukuPelajaran buku1 = new BukuPelajaran(judul, pengarang, tahunTerbit, harga, stok, mataPelajaran, tingkatKelas);
        System.out.println("------- Info Buku Pelajaran -------");
        buku1.getInfo();

        System.out.println("\n------- Kurangi Stok -------");
        System.out.print("kurangi stok: ");
        int kurang = sc.nextInt();
        sc.nextLine();                             
        buku1.kurangiStok(kurang);  
        System.out.println("------- Info Buku Pelajaran -------");
        buku1.getInfo();
        System.out.println("=====================================");

        // Untuk Info Novel
        System.out.println("\n=============== Novel ==============");
        System.out.println("--- Masukkan data Buku Pelajaran ---");
        System.out.print("Judul: ");
        String judul2 = sc.nextLine();
        System.out.print("Pengarang: ");
        String pengarang2 = sc.nextLine();
        System.out.print("Tahun Terbit: ");
        String tahunTerbit2 = sc.nextLine();
        System.out.print("Harga: ");
        int harga2 = sc.nextInt();
        System.out.print("Jumlah Stok: ");
        int stok2 = sc.nextInt();
        sc.nextLine();
        System.out.print("Genre: ");
        String genre = sc.nextLine();
        Novel buku2 = new Novel(judul2, pengarang2, tahunTerbit2, harga2, stok2, genre);
        System.out.println("------------ Info Novel ------------");
        buku2.getInfo();

        System.out.println("\n------- Tambah Stok -------");
        System.out.print("tambah stok: ");
        int tambah = sc.nextInt();
        sc.nextLine();                             
        buku2.tambahStok(tambah);  
        System.out.println("------- Info Buku Pelajaran -------");
        buku2.getInfo();
        System.out.println("=====================================");
    }
}

// System.out.println("=== Info Buku Pelajaran ===");
// BukuPelajaran buku1 = new BukuPelajaran("Statistika", "Tim Pengajar",
// "2018", 25000, 10, "Matematika", "Kelas 11");
// buku1.getInfo();

// System.out.println("\n=== Info Novel ===");
// Novel buku2 = new Novel("Bumi", "Tere Liye", "2016", 125000, 5, "Fiksi");
// buku2.getInfo();