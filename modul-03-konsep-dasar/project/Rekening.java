package Guided.enkapsulasi;

public class Rekening {
    private int saldo = 0;
    
    public void tambahsaldo (int jumlah ){
        saldo = saldo + jumlah;
        System.out.println("Saldo berhasil ditambahkan");
    }
    
    public void tampilkansaldo(){
        System.out.println("Saldo anda " + saldo);
    }
}
