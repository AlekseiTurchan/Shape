
package Sape;

public abstract class Shape {
    
    private double x,y;
    private String name;

    public Shape(double x, double y, String name) {
        this.x = x;
        this.y = y;
        this.name = name;
    }

   
    @Override
    public String toString() {
        return "Shape{" + "x=" + x + ", y=" + y + ", name=" + name + '}';
    }
    
    public abstract double area();
    
}
