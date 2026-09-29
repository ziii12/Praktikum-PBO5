package Guided01;

public class java {
    public static void main(String[] args) {
        //cara 1
        int[] varArray1;
        varArray1 = new int[5];
        varArray1[0] = 11;
        varArray1[1] = 22;
        varArray1[2] = 33;
        
        //Cara 2
        int[] varArray2 = new int[5];
        
        //Cara 3
        int[] varArray3 = {1,2,3,4,5};
        
        System.out.println(varArray3[3]);
        
        //ARRAY 2 DIMENSI
        int[][] arr2d = new int[2][2];
        arr2d[0][0] = 10;
        arr2d[0][1] = 20;
        arr2d[1][0] = 30;
        arr2d[1][1] = 40;
        System.out.println("Nilai baris 1 kolom 2:" + arr2d[0][1]);
    }
}