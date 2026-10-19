package Unguided;

public class Kasir {
    private String namaKasir;
 
    public Kasir(String namaKasir) {
        this.namaKasir = namaKasir;
    }
 
    public String getNamaKasir() {
        return namaKasir;
    }
 
    // Asosiasi: Pesanan hanya diterima lewat parameter, tidak disimpan sebagai field
    public void prosesPembayaran(Pesanan pesanan) {
        double totalSubtotal = 0;
        double totalPajak = 0;
        Itempesanan[] items = pesanan.getDaftarItem();
 
        for (int i = 0; i < pesanan.getJumlahItem(); i++) {
            totalSubtotal += items[i].getRincian().getHargaDasar();
            totalPajak += items[i].getRincian().getPajak();
        }
        double totalBayar = totalSubtotal + totalPajak;
 
        System.out.println("=== STRUK PEMBAYARAN KASIR ===");
        System.out.println("Kasir Bertugas : " + namaKasir);
        System.out.println("Pesanan        : Meja " + pesanan.getNomorMeja());
        System.out.println("Jumlah Item    : " + pesanan.getJumlahItem());
        System.out.println("Total Subtotal : Rp " + totalSubtotal);
        System.out.println("Total Pajak    : Rp " + totalPajak);
        System.out.println("TOTAL BAYAR    : Rp " + totalBayar);
        System.out.println("==============================");
    }
}
  
