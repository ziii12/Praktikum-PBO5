package Unguided;
 
public class Main {
 
    public static void main(String[] args) {
 
        // Objek 1: constructor tanpa parameter, lalu isi memakai setter
        Dataset d1 = new Dataset();
        d1.setNama("Titanic");
        d1.setJumlahBaris(891);
        d1.setJumlahKolom(12);
        d1.setJumlahMissing(866);
 
        // Objek 2: constructor 1 parameter
        Dataset d2 = new Dataset("Wine Quality");
 
        // Objek 3: constructor lengkap
        Dataset d3 = new Dataset("Iris", 150, 5, 0);
 
        // Simpan ketiga objek dalam array
        Dataset[] daftar = {d1, d2, d3};
 
        // Cetak laporan tiap dataset dengan perulangan
        Laporandataset laporan = new Laporandataset();
        for (int i = 0; i < daftar.length; i++) {
            laporan.cetak(daftar[i]);
            System.out.println();
        }
 
        // Tampilkan total dataset (dipanggil lewat nama class)
        System.out.println("Total dataset dibuat : " + Dataset.getTotalDataset());
    }
}
 
