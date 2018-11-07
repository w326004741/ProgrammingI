package Assignment6;

/**
 * @author Weichen Wang
 * @date 2018/10/31 - 下午12:03
 * @describe: 1. follow the UML Diagram.
 * 2. Postgraduate students pass if the average mark over the 3 exams is 50 or above.
 */
public class PostGraduate extends Student {
    // underGraduate default constructor
    public PostGraduate() {
        super();  // super() is used to explicitly state that default constructor from superclass is inherited.
        // super关键字用于显式声明继承了超类的默认构造函数
    }

    // 子类的构造函数
    // Override Constructor inherited from superclass
    public PostGraduate(String name, long id) {
        super(name, id);
    }

    // Overriding calculateResult() method 覆写
    @Override
    public void calculateResult() {
        int sum = 0;
        for (int i = 0; i < getNumTests(); i++) {
            int testScore = getTestScore(i);
            sum = sum + testScore;
        }
        int average = sum / getNumTests();// average results of 3 test.
        // PostGraduate Students pass if the average mark of their 3 exam results is greater than or equal to 50.
        // grade >= 50 -> Grade = Pass; else Grade = Fail;
        if (average >= 50) {
            setGrade("Pass");
        } else {
            setGrade("Fail");
        }
        System.out.println("================PostGraduate Student=================\nAverage Result of " + getName() + "'s 3 tests: " + average);
    }

}
