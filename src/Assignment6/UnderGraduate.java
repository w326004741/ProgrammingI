package Assignment6;

/**
 * @author Weichen Wang
 * @date 2018/10/31 - 下午12:02
 * @description: 1. follow the UML Diagram
 * 2.  Undergraduate Students pass if the average mark of their 3 exam results is greater than or equal to 40.
 */
// 继承了Student所有的成员变量和方法
public class UnderGraduate extends Student {
    // 子类的构造函数
    // underGraduate default constructor
    public UnderGraduate() {
        super(); // super() is used to explicitly state that default constructor from superclass is inherited.
        // super关键字用于显式声明继承了超类的默认构造函数
    }

    // 子类的构造函数
    // Override Constructor inherited from superclass
    public UnderGraduate(String name, long id) {
        super(name, id);
    }

    // Overriding calculateResult() method 覆写
    @Override
    public void calculateResult() {
        int sum = 0; //declare int variable sum as all the test result
        for (int i = 0; i < getNumTests(); i++) {
            int testScore = getTestScore(i);
            sum = sum + testScore;
        }
        int average = sum / getNumTests(); // average results of 3 test.
        // Undergraduate Students pass if the average mark of their 3 exam results is greater than or equal to 40.
        // grade >= 40 -> Grade = Pass; else Grade = Fail;
        if (average >= 40) {
            setGrade("Pass");
        } else {
            setGrade("Fail");
        }
        System.out.println("================Graduate Student=================\nAverage Result of " + getName() + "'s 3 tests: " + average);
    }
}


