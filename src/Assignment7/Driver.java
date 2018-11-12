package Assignment7;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Weichen Wang
 * @date 2018/11/7 - 12:51 PM
 * 1. create s an ArrayList of type Shapes
 * 2. populate it with Rectangle and Circle instances
 */
public class Driver {
    public static void main(String[] args) {
        // create a new ArrayList object, shapes as List, Shapes as element type.
        List<Shapes> shapes = new ArrayList<>();

        // A Circle reference to a Circle Object and assign the radius value
        // A Rectangle reference to a Rectangle Object and assign the radius values
        Circle circle = new Circle(1);
        Rectangle rectangle = new Rectangle(3, 4);
        // use list.add() method store circle and rectangle values in a shapes(list)
        shapes.add(circle);
        shapes.add(rectangle);

        System.out.println();
        System.out.println("========Calculate Area===========");
        // use for() loop for iterating through an array(shapes)
        for (int i = 0; i < shapes.size(); i++) {
            shapes.get(i).calculateArea(); // called the calculateArea() method of Shapes to calculate Area of Shape(circle & Rectangle)
        }

        System.out.println("================Compare Shapes Result=======================");
        // called largestShape() method and output the largest Shape
        System.out.println("Largest Shape: " + largestShape(shapes).toString());
    }

    // calculate the largest shape based on area in the collection
    // 工厂模式
    public static Shapes largestShape(List<Shapes> list) {
        Shapes largestShape = null;
        // use foreach() for iterating through an array(list)
        for (Shapes shape : list) {
            if ((largestShape == null) || (shape.compareShapes(largestShape) > 0)) {
                largestShape = shape;
            }
        }
        return largestShape;
    }
}
