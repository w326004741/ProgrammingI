package Assessment;

import java.util.Scanner;

/**
 * @author Weichen Wang
 * @date 2018/10/8 - 上午10:50
 * @describe Write a program that replies either Leap Year of Not a Leap
 * *               Year when given a year. It is a leap year if the year is
 * *               divisible by 4 but not by 100 (i.e. 1796 is a leap year because
 * *               it is divisible by 4 but not by 100). A year that is divisible
 * *               by both 4 and 100 is a leap year if it is also divisible by 400
 * *               (i.e. 2000 is a leap year but 1800 is not).
 */
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a Year: ");
        long year = sc.nextLong();

        // Leap year is divisible by 4 but not by 100(&&), or(||) the year is divisible by 400
        System.out.println("===================Output================");
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " is a Leap year.");
        } else {
            System.out.println(year + " is Not a Leap year");
        }
    }

}
