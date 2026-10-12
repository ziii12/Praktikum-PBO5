package Unguided;

public class Dataset {

    // KONSTANTA: batas persen missing (nilainya tidak bisa diubah)
    public static final double BATAS_MISSING = 5.0;

    // VARIABEL MILIK CLASS (static): menghitung berapa objek Dataset yang dibuat
    private static int totalDataset = 0;

    // ATRIBUT dibuat private supaya tidak bisa diubah langsung dari luar class
    private String nama;
    private int jumlahBaris;
    private int jumlahKolom;
    private int jumlahMissing;

    // CONSTRUCTOR 1: tanpa parameter
    public Dataset() {
        nama = "";
        jumlahBaris = 0;
        jumlahKolom = 0;
        jumlahMissing = 0;
        totalDataset++; // tambah hitungan
    }

    // CONSTRUCTOR 2: hanya nama
    public Dataset(String nama) {
        this.nama = nama;
        jumlahBaris = 0;
        jumlahKolom = 0;
        jumlahMissing = 0;
        totalDataset++; // tambah hitungan
    }

    // CONSTRUCTOR 3: lengkap
    public Dataset(String nama, int jumlahBaris, int jumlahKolom, int jumlahMissing) {
        this.nama = nama;
        this.jumlahBaris = jumlahBaris;
        this.jumlahKolom = jumlahKolom;
        this.jumlahMissing = jumlahMissing;
        totalDataset++; // tambah hitungan
    }

    // METHOD STATIC: bisa dipanggil tanpa membuat objek -> Dataset.getTotalDataset()
    public static int getTotalDataset() {
        return totalDataset;
    }

    // ===== GETTER (untuk membaca nilai atribut) =====
    public String getNama() {
        return nama;
    }

    public int getJumlahBaris() {
        return jumlahBaris;
    }

    public int getJumlahKolom() {
        return jumlahKolom;
    }

    public int getJumlahMissing() {
        return jumlahMissing;
    }

    // ===== SETTER (untuk mengisi nilai atribut) =====
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Jika nilai negatif, nilai lama tidak berubah
    public void setJumlahBaris(int jumlahBaris) {
        if (jumlahBaris >= 0) {
            this.jumlahBaris = jumlahBaris;
        }
    }

    public void setJumlahKolom(int jumlahKolom) {
        if (jumlahKolom >= 0) {
            this.jumlahKolom = jumlahKolom;
        }
    }

    public void setJumlahMissing(int jumlahMissing) {
        if (jumlahMissing >= 0) {
            this.jumlahMissing = jumlahMissing;
        }
    }

    // Menghitung persentase sel kosong = missing / (baris x kolom) x 100
    public double getPersentaseMissing() {
        int totalSel = jumlahBaris * jumlahKolom;

        if (totalSel == 0) {
            return 0; // hindari pembagian dengan nol
        }

        return (double) jumlahMissing / totalSel * 100;
    }

    // true jika persentase missing lebih besar dari batas (5%)
    public boolean perluDibersihkan() {
        return getPersentaseMissing() > BATAS_MISSING;
    }
}

