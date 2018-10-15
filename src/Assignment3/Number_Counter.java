package Assignment3;

import java.util.Scanner;

/**
 * @author Weichen Wang
 * @date 2018/10/10 - 下午4:26
 * @Descibe: Write a program that counts the number of digits in an integer
 * *                    entered by the user. The program should repeatedly ask for
 * *                    input and displays the number of digits the input integer
 * *                    has. 计算输入数字的个数
 */
public class Number_Counter {

    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("This program counts the number of digits \nint an integer entered by the user.");
        System.out.println("*Enter -1 to exit*");
        System.out.println("=========================================");
        //use while(true) loop to keep always iterate, and have to break out of it using 'break'.
        while (true) {
            // create a new reference and refer to the input stream. 创建一个新引用并引用输入流。
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Number :");
            // read the next line from the stream (entered from the keyboard) and store it in a String variable named num.
            String num = sc.nextLine(); //从流中读取下一行（从键盘输入）并将其存储在名为user的Int变量中
            // '==' is a reference comparison/address comparison, i.e. both objects point to the same memory location.
            // equals() evaluates to the comparison of values in the objects
            if (num.equals("-1")) {   // equals()比较数值本身的值，== 比较的是地址Address
                System.out.println("Program Teminated .....");
                break; // the loop is terminated.
            }
            System.out.println("Number of digits in " + num + " is " + num.length() + "\n");
            // num.length() method returns the length of num.   获得字符串的长度
        }
    }
}
