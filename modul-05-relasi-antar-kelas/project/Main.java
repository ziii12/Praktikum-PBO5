package Unguided;

public class Main {
    public static void main(String[] args) {
        // 1. Kasir
        Kasir kasir = new Kasir("Budi");
 
        // 2. Itempesanan dibuat independen (RincianHarga dibuat otomatis di dalamnya)
        Itempesanan item1 = new Itempesanan("Iced Americano", 18000);
        Itempesanan item2 = new Itempesanan("Beef Croissant", 25000);
        Itempesanan item3 = new Itempesanan("Matcha Latte", 22000);
 
        // 3. Pesanan untuk Meja 4, kapasitas 5 item
        Pesanan pesanan = new Pesanan(4, 5);
 
        // 4. Agregasi: masukkan item ke pesanan
        pesanan.tambahItem(item1);
        pesanan.tambahItem(item2);
        pesanan.tambahItem(item3);
 
        // 5. Tampilkan pesanan
        pesanan.tampilkanPesanan();
 
        // 6. Asosiasi: kasir memproses pembayaran
        kasir.prosesPembayaran(pesanan);
    }
}