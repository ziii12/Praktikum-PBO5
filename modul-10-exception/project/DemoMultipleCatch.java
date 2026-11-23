package com.zia.guided;

public class DemoMultipleCatch {
    public static void main(String[] args) {
        try {
            int x = 0;
            int y = 100 / x;

            int[] arr = {10, 11};
            y = arr[x];

            System.out.println("Tidak terjadi eksepsi");
        } catch (ArithmeticException e) {
            System.out.println("Exceptio karena tidak bisa dibagi dengan 0");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception karena indeks tidak valid");
        }

        System.out.println("Program Selesai");
    }
}
