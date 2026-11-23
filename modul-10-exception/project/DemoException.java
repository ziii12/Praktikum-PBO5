package com.zia.Guided5;

public class DemoException {
    public static void main(String[] args) {
        Coba c = new Coba();
        try {
            c.tampil();
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e.getMessage());
        }
        System.out.println("Program Selesai");
    }
}
