package Assignment3;

/**
 * @author Weichen Wang
 * @date 2018/10/10 - 下午4:38
 * @Description: Entity Class 实体类
 */
public class Student {
    private String name;   // declare private string type name instance variable
    private long IDnumber; // declare private long type IDnumber instance variable

    public Student() {
        // no-argument constructor
    }

    public Student(String name, long IDnumber) { // 2 arguments constructor
        this.name = name;
        this.IDnumber = IDnumber;
    }

    // getter & setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getIDnumber() {
        return IDnumber;
    }

    public void setIDnumber(long IDnumber) {
        this.IDnumber = IDnumber;
    }

    // 重写toString, 不重写输出的就是返回对象的类名+@+hashcode值, 重写才会转成String输出
    // Override/Implement Method
    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", IDnumber=" + IDnumber + '}';
    }
}
