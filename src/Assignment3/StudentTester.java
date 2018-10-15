package Assignment3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Weichen Wang
 * @date 2018/10/10 - 下午4:51
 * @description: Create a tester class which: i) creates an array to hold a
 * *               collection of Student objects. ii) adds a number of instances
 * *               of Student to the array. ii) uses a loop to traverse the array
 * *               and display the contents.
 * ArrayList
 */
public class StudentTester {

    public static void main(String[] args) throws IOException {
        // Create an array to hold a collection of Student object.
        // 创建ArrayList对象 Student是元素类型， student是list
        List<Student> students = new ArrayList<Student>();
        // use while(true) loop to keep always iterate, and have to break out of it using 'break'.
        while (true) {
            menu();  // call the menu() method.
            // create a new reference and refer to the input stream. 创建一个新引用并引用输入流。
            Scanner sc = new Scanner(System.in);
            // read the next line from the stream (entered from the keyboard) and store it in a Int variable named user
            //从流中读取下一行（从键盘输入）并将其存储在名为user的Int变量中
            int user = sc.nextInt();
            // use switch() loop to execution to different parts of code based on user typing number.
            switch (user) {
                case 1:
                    show(students); // if user typing '1', then jump to show() method and execution code.
                    break; // output show() method and then end of switch(user) loop
                case 2:
                    add(students); // if user typing '2', then jump to add() method and execution code.
                    break; // output add() method and then end of switch(user) loop
                case 3:
                    System.out.println("\nThank you for your using, See you :)");
                    System.exit(0); // Stop the currently running JVM (memory released)
                    break;
                default:
                    System.out.println("\nSorry, We don't have this function, Please Enter Again.");
                    break;
            }
        }
    }

    public static void menu() {
        System.out.println("=========================");
        System.out.println("1. Show Student Info");
        System.out.println("2. Add Student Info");
        System.out.println("3. Exit");
        System.out.println("=========================");
        System.out.print("Please enter number : ");
    }

    public static void add(List<Student> students) {
        Scanner sc = new Scanner(System.in); // // create a new reference and refer to the input stream.
        System.out.println();
        System.out.print("Please enter name: ");
        // read the next line from the stream (entered from the keyboard) and store it in a String variable named name.
        String name = sc.nextLine();
        System.out.print("Please entet ID number: ");
        // read the next line from the stream (entered from the keyboard) and store it in a Long variable named id.
        long id = sc.nextLong();
        Student s = new Student(name, id); // create objects and call set method on the object.
        students.add(s); // add student(name,id) into list student.
        System.out.println("======Successfully Added!======");
        System.out.println();
    }

    public static void show(List<Student> students) {
        // if the number of element in the list equal to 0
        if (students.size() == 0) {
            System.out.println("\nNo Student Information in System now. ====> (2.Add Student Info). ");
        } else {
            System.out.println();
            System.out.println("=====================Student Info=====================");
            // use a foreach to traverse the array. 遍历数组 Student代表集合的元素类型 students is list
            for (Student stuInfo : students) {
                System.out.println(stuInfo);
            }
        }
        System.out.println();
    }
}

