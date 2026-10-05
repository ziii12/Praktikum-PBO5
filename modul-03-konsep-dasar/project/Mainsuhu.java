package Unguided;

import java.util.Arrays;

public class Mainsuhu {
    public static void main(String[] args) {
        // 1. Siapkan array suhu (Hari 1 = index 0)
        double[] suhuHarian = {30.4, 24.3, 26.8, -1.0, 31.4, 30.8, 32.9};

        // 2. Buat object, tampilkan data awal dan index kosong
        PengolahSuhu pengolah = new PengolahSuhu(suhuHarian);

        System.out.println("=== Data Suhu Awal ===");
        pengolah.tampilkanData();
        System.out.println();
        System.out.println("Index hari kosong (dimulai dari 0): " + pengolah.cariIndexKosong());
        System.out.println();

        // 3. Isi data kosong
        pengolah.isiDataKosong();

        // 4. Tampilkan data akhir dan rata-rata
        System.out.println("=== Data Suhu Setelah Pengisian ===");
        pengolah.tampilkanData();
        System.out.println();
        System.out.printf(java.util.Locale.US, "Rata-rata : %.2f°C%n", pengolah.hitungRataRata());
        System.out.println();

        // 5. Tampilkan array di main
        System.out.println("Isi array suhuHarian di main setelah isiDataKosong() dijalankan:");
        System.out.println(Arrays.toString(suhuHarian));
        System.out.println("(ikut berubah: constructor menyimpan referensi array yang sama)");

    }
}