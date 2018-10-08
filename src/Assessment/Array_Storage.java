package Assessment;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Weichen Wang
 * @date 2018/10/8 - 上午11:07
 * @describe You are required to write a Java program which takes in numbers
 * *               from the used and stores them in an array of type double. The
 * *               program should then print the sum and contents of the array to
 * *               the screen. The program is to begin by asking the user the
 * *               array size prior to creatng an array of the given size. A for
 * *               loop should be used to populate the array, taking each number
 * *               from the user. A second for loop is to be used to sum and
 * *               display the array contents.
 */
public class Array_Storage {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter size of array: ");

        // Declare array variable and create a double array and assign it to the double[] variable n.
        int n = sc.nextInt(); // 定义并数组的长度由Scanner输入设定
        double[] arr = new double[n]; // 声明并创建一个double类型数组并有n个长度的数
        System.out.println("Please Enter " + n + " numbers: ");
        // for() 循环依次遍历数组内的每个值
        for (int x = 0; x < arr.length; x++) {
            double y = sc.nextDouble(); // 定义double类型 y, 并把Scanner输入的数值给y
            arr[x] = y; // 数组arr[x] 接受 y变量内的数值，填充数组。
        }

        double sum = 0;
        // foreach() - iterate over an array or Iterable 迭代数组
        for (double i : arr) {
            sum = sum + i;
        }
        System.out.println("=================================Output=================================");
        // DecimalFormat()方法控制double类型输出结果的小数点个数： new DecimalFormat("0.00").format()
        System.out.println("Sum of array ===> " + new DecimalFormat("0.00").format(sum) + "\n");
        System.out.println("Arrays is here: " + Arrays.toString(arr));
        // 利用Arrays工具类中的.toString静态方法 将以为数组转为字符串形式并输出。

    }
}
