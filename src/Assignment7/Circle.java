package Assignment7;

/**
 * @author Weichen Wang
 * @date 2018/11/7 - 11:57 AM
 */
// 子类中
public class Circle extends Shapes {
    // Data member
    private double radius;// Declare instance variables as private
    private double PI = Math.PI;//private static final double PI = 3.14; // static final 设置 PI 固定值为3.14

    // default Constructor
    public Circle() {
        radius = 0.0;
    }

    // Override Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // getter & setter Radius method
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Implement Methods from Shapes(superclass) 重写抽象方法 计算圆形的面积
    @Override
    public void calculateArea() {
        // calculate Area for Circle: PI * radius * radius
        // should use the area(super.area) from Shape class(superclass) no use local variable called area
        super.area = this.PI * this.radius * this.radius;
        System.out.println("The Circle Area is : " + super.area);
    }

    // Override toString() method
    @Override
    public String toString() {
//        return "Circle";
        return "Circle{" + "radius=" + radius + ", PI=" + PI + '}';
    }
}
