/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Guided1.Agregasi;

class namaJurusan {
    private static int jumlahMahasiswa;
    private String kodeJurusan, namaJurusan;
    private Mahasiswa[] daftarMahasiswa = new Mahasiswa[32];
    
    //Constructor
    public namaJurusan(String kodeJurusan, String namaJurusan){
        this.kodeJurusan = kodeJurusan;
        this.namaJurusan = namaJurusan;
    }
    
    //Behaviour
    public void addMahasiswa(Mahasiswa m){
        this.daftarMahasiswa[jumlahMahasiswa] = m;
        jumlahMahasiswa++;
    }
    
    public void displayMahasiswa(){
        System.out.println("Kode Jurusan: " + this.kodeJurusan);
        System.out.println("Nama Jurusan: " + this.namaJurusan);
        
        System.out.println("Daftar Mahasiswa: ");
        
        for (int i = 0; i < jumlahMahasiswa; i++){
            System.out.println(i+1 + ". " + daftarMahasiswa[i].getNIM() + " " + daftarMahasiswa[i].getNama());
        }
    }
    
    //Getter
    public String getKodeJurusan(){
        return kodeJurusan;
    }
        
    public String getNamaJurusan(){
        return namaJurusan;
    }
    
    //Setter
    public void setKodeJurusan(String kodeJurusan){
        this.kodeJurusan = kodeJurusan;
    }
    
    public void setNamaJurusan(String namaJurusan){
        this.namaJurusan = namaJurusan;
    }
        
}
