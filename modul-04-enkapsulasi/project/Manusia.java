package Guided01;

public class Manusia {
//definisi atribut
private String nama;
private int umur;

//4.2 sebuah constructor
public Manusia() {}

public Manusia(String nama) {
    this.nama = nama;
}

public Manusia(String nama, int umur) {
    this.nama = nama;
    this.umur = umur;
}
//mahasiswaobjekManusia = new Manusia(
//Method setter
public void setNama(String a){
    nama = a;
}
//method getter
public String getNama(){
    return nama;
}
public void setUmur(int umur){
    this.umur = umur;
}
public int getUmur(){
    return umur;
}
}

