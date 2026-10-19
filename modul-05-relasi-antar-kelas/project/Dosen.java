package Guided;

public class Dosen {
    private String kodeDosen;
    private String namaDosen;

    // Setter
    public void setKodeDosen(String kodeDosen) {
        this.kodeDosen = kodeDosen;
    }

    public void setNamaDosen(String namaDosen) {
        this.namaDosen = namaDosen;
    }

    // Getter
    public String getKodeDosen() {
        return this.kodeDosen;
    }

    public String getNamaDosen() {
        return this.namaDosen;
    }

    public void giveScore(Mahasiswa s, int nilai) {
        // ini asosiasi, method milik class Mahasiswa dipanggil di class Dosen,
        // tp objek Mahasiswa tidak menjadi atribut dr class Dosen
        s.setNilai(nilai);
    }

    public int getScore(Mahasiswa s) {
        // ini asosiasi, method milik class Mahasiswa dipanggil di class Dosen,
        // tp objek Mahasiswa tidak menjadi atribut dr class Dosen
        return s.getnilai();
    }

    public static void main(String[] args) {
    Mahasiswa m = new Mahasiswa();
    m.setNim("130118383");
    m.setNama("Budi");

    Dosen d = new Dosen();
    d.giveScore(m, 90);

    System.out.println("NIM   : " + m.getNim());
    System.out.println("Nama  : " + m.getNama());
    System.out.println("Nilai : " + d.getScore(m));
}
}