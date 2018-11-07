package Assignment6;

import java.util.Scanner;

/**
 * @author Weichen Wang
 * @date 2018/10/31 - 下午12:10
 * @descibe: 1. Check the Student type are UnderGraduate or PostGraduate
 * 2. The application should allow the user to enter the name, ID number and exam results (which lie in the range of 0- 100) for each student.
 */
public class Results_Tester {
    public static void main(String[] args) {
        // create a new reference and refer to the input stream. 创建一个新引用并引用输入流。
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of student: "); // 输入学生人数
        int studentArray = sc.nextInt(); // read the next int from the stream (entered from the keyboard) and store it in a Int variable named studentArray
        Student[] st = new Student[studentArray]; // Scanner输入人数并存入studentArray数组内并设为数组长度 赋值给Student[]数组对象
        System.out.println("============================");
        System.out.println("1. Undergraduate Student");
        System.out.println("2. Postgraduate Student");
        System.out.println("============================");

        for (int i = 0; i < st.length; i++) {
            System.out.print("Choice:  ");
            int stuType = sc.nextInt(); // read the next int from the stream (entered from the keyboard) and store it in a Int variable named stuType
            sc.nextLine();

            if (stuType == 1) {
                // create undergraduate object
                System.out.print("Enter Student Name: ");
                String name = sc.nextLine();
                System.out.print("Enter ID Number: ");
                Long id = sc.nextLong();
                st[0] = new UnderGraduate(name, id);
            } else if (stuType == 2) {
                // create postgraduate object
                System.out.print("Enter Student Name: ");
                String name = sc.nextLine();
                System.out.print("Enter ID Number: ");
                Long id = sc.nextLong();
                st[1] = new PostGraduate(name, id);
            }

            // j = index
            for (int x = 0; x < st[i].getNumTests(); x++) {
                System.out.print("Enter test result " + (x + 1) + " of " + st[i].getName() + ":");
                int score = sc.nextInt();
                st[i].setTestScore(x, score);
            }
            System.out.println();
        }
        // 遍历st数组并每次调用calculateResult() method,最后用toString() method输出st[i].
        // use for() loop iterating through an array(st) and call calculateResult() method each time
        // use toString() method to output st[i];
        for (int i = 0; i < st.length; i++) {
            st[i].calculateResult();
            System.out.println(st[i].toString() + "\n");
        }
    }
}
