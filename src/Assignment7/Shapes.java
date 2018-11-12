package Assignment7;

/**
 * @author Weichen Wang
 * @date 2018/11/7 - 11:59 AM
 */

//  To prevent a class from being instantiated you can make the class abstract
// 要防止实例化类，可以使类抽象化
// To declare a class abstract, use the abstract keyword
// 定义一个抽象类
// 抽象类中可以包含具体的方法，当然也可以不包含抽象方法
// 实现接口的实现类必须要实现该接口的所有方法
public abstract class Shapes implements ShapesRelate {

    // protected 修饰符指定只能在自己的package中访问该成员，不能public
    // 还可以在另一个package中通过 该类的子类访问该成员
    // protected the member can only be accessed within its own package
    protected double area; // Data member

    // default Constructor
    public Shapes() {
        area = 0.0;
    }

    // getter method
    public double getArea() {
        return area;
    }

    // 定义一个抽象方法,该抽象方法必须要由子类来进行重写
    // 只要包含一个抽象方法的抽象类，该方法必须要定义成抽象类，不管是否还包含其他方法
    // 抽象类提供给子类重构该方法
    // Define an abstract method that must be overridden by a subclass
    public abstract void calculateArea();

    // 覆写实现了接口方法 Override compareShapes method of ShapeRelate Interface
    @Override
    public int compareShapes(ShapesRelate sr) {
        Shapes largestShape = (Shapes) sr; // casting, 把sr方法放进Shapes内，Shapes就可以调用到ShapesRelate内的所有方法了
        if (this.getArea() > largestShape.getArea()) {
            //System.out.println("1 " + this.getArea() + " " + largestShape.getArea());
            return 1;
        } else if (this.getArea() < largestShape.getArea()) {
            // System.out.println("-1 " + this.getArea() + " " + largestShape.getArea());
            return -1;
        } else {
            //System.out.println("0 " + this.getArea() + " " + largestShape.getArea());
            return 0;
        }
    }
}


