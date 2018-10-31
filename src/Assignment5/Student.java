package Assignment5;

/**
 * @author Weichen Wang
 * @date 2018/10/24 - 下午4:04
 * @descibe: 1: The Student class contains three private data member.
 * 2: Write a default constructor and Overloading constructor.
 * 3: Get getter and setter methods for each of the private data members in this class
 * 4: Override the toString() method.
 */
public class Student {
    private String name; // declare three instances variables but don't assign a value. data members, make the instance variable private
    private int id;
    private String course;

    // default Constructor
    public Student() {
        name = "unassigned";
        id = 0;
        course = "unassigned";
    }

    // making a constructor with parameters to set value.
    // Overloading Constructor / Parameterized constructor
    public Student(String name, int id, String course) {
        this.name = name;
        this.id = id;
        this.course = course;
    }

    // creating a getter & setter method per student variable.
    // get & set name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // get & set Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // get & set course
    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    // Override toString() Method
    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", id=" + id + ", course='" + course + '\'' + '}';
    }
}
