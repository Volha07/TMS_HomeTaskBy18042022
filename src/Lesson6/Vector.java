package Lesson6;

public class Vector {
    private double x;
    private double y;
    private double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }



    public double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }
    public double scalarProduct(Vector vector) {
        return x * vector.x + y * vector.y + z * vector.z;
    }

  /*  public static Vector[] generate(int n){
        Vector[] vectors = new Vector[n];
        for(int i =0; i < n; i++){
            vectors[i] = new Vector(Math.random(), Math.random(), Math.random());
        }
        return vectors;
    } */





    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double getZ() {
        return z;
    }

}
