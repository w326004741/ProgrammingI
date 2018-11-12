package Assignment7;

/**
 * @author Weichen Wang
 * @date 2018/11/7 - 11:59 AM
 */
public class Rectangle extends Shapes {
    private double length; // Declare instance variables as private
    private double width;

    // default constructor
    public Rectangle() {
        length = 0.0;
        width = 0.0;
    }

    // Override Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // getter & setter methods
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    // Implement Methods from Shapes(superclass) 重写抽象方法 计算矩形面积
    @Override
    public void calculateArea() {
        // calculate Area for Rectangle: length * width
        // should use the area from Shape class(superclass) no use local variable called area
        super.area = this.length * this.width;
        System.out.println("The Rectangle Area is : " + super.area);
    }

    @Override
    public String toString() {
        return "Rectangle{" + "length=" + length + ", width=" + width + '}';
    }
}
