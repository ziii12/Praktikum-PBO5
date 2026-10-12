package Unguided;
import java.util.Locale;
public class Laporandataset {
   // Method cetak: menerima satu objek Dataset lalu menampilkan laporannya
    public void cetak(Dataset d) {
 
        // Tentukan status berdasarkan hasil perluDibersihkan()
        String status;
        if (d.perluDibersihkan()) {
            status = "Perlu dibersihkan";
        } else {
            status = "Bersih";
        }
 
        // Locale.US dipakai supaya angka desimal memakai titik (8.10), bukan koma
        String persen = String.format(Locale.US, "%.2f", d.getPersentaseMissing());
 
        System.out.println("=== Laporan Dataset ===");
        System.out.println("Nama         : " + d.getNama());
        System.out.println("Jumlah Baris : " + d.getJumlahBaris());
        System.out.println("Jumlah Kolom : " + d.getJumlahKolom());
        System.out.println("Missing      : " + d.getJumlahMissing() + " sel (" + persen + "%)");
        System.out.println("Status       : " + status);
    } 
}
