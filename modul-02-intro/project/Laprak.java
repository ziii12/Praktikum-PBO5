package Unguided;

public class Laprak {
 final static double KKM = 75.0;
 public static void main(String[] args) {
      
     //Array 1 dimensi : menyimpan nama mahasiswa
     String[] namaMahasiswa = {"Andi", "Budi", "Citra"};
     
     //Array 2 dimensi : meyimpan nilai 2 modul tiap mahasiswa
     double[][] nilaiModul = {
         {80.0, 85.0}, // nilai Andi
         {70.0, 65.0}, // nilai Budi
         {90.0, 90.0}  // nilai citra
     };
     
     System.out.println("REKAP NILAI PRAKTIKUM");
     System.out.println("KKM: " + KKM);
     
     //Perulangan untuk mengakses setiap mahasiswa
     for (int i = 0; i < namaMahasiswa.length; i++) {
         double totalNilai = 0;
         
         //Perulangan untuk menjumlahkan nilai tiap modul
        for (int j = 0; j < nilaiModul[i].length; j++){
            totalNilai += nilaiModul[i][j];
        }
     
        double Ratarata = totalNilai / nilaiModul[i].length;
        
        //Percabangan : menentukan status kelulusan
        String status;
        if (Ratarata >= KKM) {
            status = "LULUS";
        } else {
            status = "REMEDIAL";
        }
        
        System.out.println();
        System.out.println("Mahasiswa " + (i + 1) + ": " + namaMahasiswa[i]);
        System.out.println("Nilai Modul 1 : " + nilaiModul[i][0]);
        System.out.println("Nilai Modul 2 : " + nilaiModul[i][1]);
        System.out.println("Rata-rata : " + Ratarata);
        System.out.println("Status : " + status);
     }
 }
}
