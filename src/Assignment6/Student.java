package Assignment6;

import java.util.Arrays;

/**
 * @author Weichen Wang
 * @date 2018/10/31 - 上午11:57
 * @describe: follow the UML diagram
 * ***getTestScore(int): int****
 * ***setTestScore(int,int): void***
 */
public class Student {
    private String name;  // Declare instance variables as private
    private long id;
    private String grade;
    private int[] test; // test: int[]
    private final static int NUM_TESTS = 3; // declare as final static variable, the value cannot be change.

    // Default Constructor
    public Student() {
        name = "unassigned";
        id = 0;
        test = new int[NUM_TESTS];
    }

    // Override Constructor
    public Student(String name, long id) {
        this.name = name;
        this.id = id;
        test = new int[NUM_TESTS];
    }

    // calculateResult() method
    public void calculateResult() {
    }

    // getter & setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    // setTestScore() method takes two arguments, the index of components in the test array (set by control variable
    // x of a nested for loop in tester class) and score of each test set by the user with Scanner object
    // setTestScore（）方法接受两个参数，测试数组中的组件索引（由测试器类中嵌套for循环的控制变量x设置）和用户使用Scanner对象设置的每个测试的分数
    public void setTestScore(int index, int score) {
        test[index] = score;
    }

    public int getTestScore(int index) {
        return test[index];
    }

    // getNumTests() method to return the length of test array, to control the for loop.
    // control variable is less than value of NUM_TESTS.
    public static int getNumTests() {
        return NUM_TESTS;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", id=" + id + ", grade='" + grade + '\'' + ", test=" + Arrays.toString(test) + '}';
    }
}


