package Unguided;

public class Itempesanan {
     private String namaItem;
    private RincianHarga rincian; // Komposisi
 
    public Itempesanan(String namaItem, double hargaDasar) {
        this.namaItem = namaItem;
        // Komposisi: RincianHarga dibuat di dalam constructor ItemPesanan
        this.rincian = new RincianHarga(hargaDasar);
    }
 
    public String getNamaItem() {
        return namaItem;
    }
 
    public RincianHarga getRincian() {
        return rincian;
    }
}

