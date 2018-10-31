package Assignment5;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Weichen Wang
 * @date 2018/10/24 - 下午4:45
 * @Description: a: creates 3 instances of the Students class
 * b: Stores them in an ArrayList
 * c: tests the constructor and all of the getter and setter methods.(测试constructor和所有的getter,setter(都用一遍))
 */
public class StudentTester {
    public static void main(String[] args) {
        // create a new ArrayList object, student as List, Student as element type.
        List<Student> student = new ArrayList<>();

        // declare a student1 reference variable and create a new Student object.
        // Assign the Student object to the reference variables
        Student student1 = new Student();
        student.add(student1); //  use list.add() method store student1 values in an student(ArrayList)

        // declare a student2 reference variable and create a new Student object.
        // Assign the Student object to the reference variables
        Student student2 = new Student();
        student2.setName("Tom Jerry"); // use & tests all of the setter method assign value to student2
        student2.setId(9527);
        student2.setCourse("Java Programming");
        student.add(student2);   // use list.add() method store student2 values in an student(ArrayList)

        // create 1 instances of the Student class
        // declare a student2 reference variable and create a new Student object.
        // tests the constructor assign the Student object to the reference variables
        Student student3 = new Student("Ian Micheal", 6828, "Mobile App Development");
        student.add(student3);  // store student1 values in an ArrayList. use list.add() method to add student1 object value into student list

        System.out.println("================Student Info===================\n");

        int x = 0;
        // use foreach() for iterating through an array(student)
        for (Student st : student) {
            if (x < 2) {
                System.out.println("[" + x + "]" + st.toString()); // Overridden toString()
            } else {
                // use and tests all of the getter method and output
                System.out.println("[" + x + "]" + "My name is '" + st.getName() + "', " + "My Student ID Number of '" + st.getId() + "'," + " and I study '" + st.getCourse() + "'.");
            }
            x++;
        }
    }
}




