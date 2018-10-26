package Assessment4;

import java.util.Scanner;

/**
 * @author Weichen Wang
 * @date 2018/10/17 - 下午9:35
 * @description: Write an application that allows the user to enter a Fahrenheit temperature and displays the
 * Celsius equivalent or enter a Celsius temperature and displays the Fahrenheit equivalent.
 * The application should include a Celsius method which returns the Celsius equivalent of a
 * Fahrenheit temperature using the following calculation;
 * celsius = 5.0/9.0 * (Fahrenheit - 32);
 * The application should also include a Fahrenheit method, which returns the Fahrenheit
 * equivalent of a Celsius temperature using the following calculation;
 * fahrenheit = 9.0/5.0 * celsius + 32;
 */
public class Temperature_Convert {
    public static void main(String[] args) {
        //use while(true) loop to keep always iterate, and have to break out of it using 'break'.
        while (true) {
            menu(); // call the menu() method and output menu() method(displays the contents of the menu() method.).
            // create a new reference and refer to the input stream. 创建一个新引用并引用输入流。
            Scanner sc = new Scanner(System.in);
            // read the next line from the stream (entered from the keyboard) and store it in a Int variable named user
            // 从流中读取下一行（从键盘输入）并将其存储在名为user的Int变量中
            int user = sc.nextInt();
            // use switch() loop to execution to different parts of code based on user typing number.
            switch (user) {
                case 1: // if user typing '1', then jump to fahrenheit() method and execution code.
                    fahrenheit(); // call the fahrenheit() method and output fahrenheit() method
                    break; // and then end of switch(user) loop
                case 2:  // if user typing '2', then jump to celsius() method and execution code.
                    celsius(); // call the celsius() method and output celsius() method
                    break; // and then end of switch(user) loop
                case 3:
                    System.out.println("Program Terminated...");
                    System.exit(0);  // Stop the currently running JVM (memory released)
                    break;
                default:
                    System.out.println("\nSorry, We don't have this function, Please Enter Again.");
                    break; // end of switch(user) loop
            }
        }
    }

    // celsius = 5.0/9.0 * (Fahrenheit - 32);
    // Fahrenheit method provides calculation fahrenheit method(fahrenheit convert to celsius)
    public static void fahrenheit() {
        // create a new reference and refer to the input stream. 创建一个新引用并引用输入流。
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature(F): ");
        // read the next line from the stream (entered from the keyboard) and store it in a Int variable named f
        int f = sc.nextInt();  // Scanner输入值存入int 类型f变量中
        double c = 5.0 / 9.0 * (f - 32); //  calculation fahrenheit method.  求摄氏度公式 double 型
        // (int) cast to double.
        System.out.println(f + " Fahrenheit is " + (int) c + " Celsius."); //  (int)c 强制转化double c为int
        System.out.println();
    }

    // fahrenheit = 9.0/5.0 * celsius + 32;
    // Celsius method provides calculation celsius method(celsius convert to fahrenheit)
    public static void celsius() {
        // create a new reference and refer to the input stream. 创建一个新引用并引用输入流。
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature(C): ");
        // read the next line from the stream (entered from the keyboard) and store it in a Int variable named c
        int c = sc.nextInt();
        double f = 9.0 / 5.0 * c + 32; // calculation Celsius method.
        // (int) cast to double.
        System.out.println(c + " Celsius is " + (int) f + " Fahrenheit.");
        System.out.println();
    }

    // menu() method provides an optional menu and is displayed at the beginning of the program.
    public static void menu() {
        System.out.println("=========================");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("3. Exit");
        System.out.println("=========================");
        System.out.print("Choice: ");
    }

}
