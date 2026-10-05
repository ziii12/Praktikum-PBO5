package Guided.enkapsulasi;

public class Enkapsulasi {
    public static void main (String[] args) {
        Rekening rek = new Rekening ();
        
       
        rek.tambahsaldo(2000000);
        rek.tampilkansaldo();
        rek.tambahsaldo(15000000);
        rek.tampilkansaldo();
    }
    
}
