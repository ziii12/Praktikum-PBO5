package Guidedfield;

public class Cirde {
    public static final double PI = 3.14159;
    
    public static double rediansToDegrees(double rads){
        return rads * 180 /PI;
    }
    
    public double r;
    
    public double area(){
        return PI * r * r;
    }
    
    public double circumference(){
        return 2 * PI * r;
    }
} 
