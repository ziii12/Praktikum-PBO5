/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided;

/**
 *
 * @author ASUS
 */
public class Pesanan {
     private int nomorMeja;
    private Itempesanan[] daftarItem; // Agregasi
    private int jumlahItem;
 
    public Pesanan(int nomorMeja, int kapasitas) {
        this.nomorMeja = nomorMeja;
        this.daftarItem = new Itempesanan[kapasitas];
        this.jumlahItem = 0;
    }
 
    // Item dibuat di luar (main), lalu dimasukkan ke sini
    public void tambahItem(Itempesanan item) {
        if (jumlahItem < daftarItem.length) {
            daftarItem[jumlahItem] = item;
            jumlahItem++;
        } else {
            System.out.println("Pesanan penuh, item " + item.getNamaItem() + " tidak dapat ditambahkan.");
        }
    }
 
    public void tampilkanPesanan() {
        System.out.println("=== DAFTAR PESANAN CAFE ===");
        System.out.println("Nomor Meja: " + nomorMeja);
        for (int i = 0; i < jumlahItem; i++) {
            Itempesanan item = daftarItem[i];
            RincianHarga r = item.getRincian();
            System.out.println((i + 1) + ". " + item.getNamaItem()
                    + " - Rp " + r.getHargaTotal()
                    + " (Harga: " + r.getHargaDasar()
                    + ", Pajak: " + r.getPajak() + ")");
        }
        System.out.println();
    }
 
    public int getNomorMeja() {
        return nomorMeja;
    }
 
    public Itempesanan[] getDaftarItem() {
        return daftarItem;
    }
 
    public int getJumlahItem() {
        return jumlahItem;
    }
}
