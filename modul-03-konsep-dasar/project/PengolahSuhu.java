package Unguided;

public class PengolahSuhu {

    // Instance field: berbeda untuk setiap object, private agar tidak bisa diakses dari luar
    private double[] suhuHarian;

    // Class field: milik class, dipakai bersama, nilainya tidak bisa diubah (final)
    private static final double NILAI_KOSONG = -1.0;

    // Nama parameter sama dengan nama field, sehingga 'this' dipakai secara eksplisit.
    // Array TIDAK disalin; yang disimpan adalah referensi ke array yang sama.
    public PengolahSuhu(double[] suhuHarian) {
        this.suhuHarian = suhuHarian;
    }

    // Kebutuhan 3: tampilkan seluruh data, hari kosong ditandai jelas
    public void tampilkanData() {
        for (int i = 0; i < suhuHarian.length; i++) {
            if (suhuHarian[i] == NILAI_KOSONG) {
                System.out.println("Hari " + (i + 1) + " : (kosong)");
            } else {
                System.out.println("Hari " + (i + 1) + " : " + suhuHarian[i] + "°C");
            }
        }
    }

    // Kebutuhan 4: cari index hari kosong, -1 jika tidak ada
    public int cariIndexKosong() {
        for (int i = 0; i < suhuHarian.length; i++) {
            if (suhuHarian[i] == NILAI_KOSONG) {
                return i;
            }
        }
        return -1;
    }

    // Kebutuhan 5: isi hari kosong dengan rata-rata hari sebelum dan sesudahnya
    public void isiDataKosong() {
        int i = cariIndexKosong();
        if (i != -1) {
            suhuHarian[i] = (suhuHarian[i - 1] + suhuHarian[i + 1]) / 2;
        }
    }

    // Kebutuhan 6: rata-rata suhu dari data yang sudah bersih
    public double hitungRataRata() {
        double total = 0;
        for (int i = 0; i < suhuHarian.length; i++) {
            total += suhuHarian[i];
        }
        return total / suhuHarian.length;
    }
}