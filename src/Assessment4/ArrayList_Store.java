package Assessment4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Weichen Wang
 * @date 2018/10/21 - 上午11:42
 * * @descibe: Write a Java application which uses an ArrayList to stores Integer values. You are required to:
 * * * - Use a standard for loop to populate the ArrayList using the Math.random()
 * * * (remember this returns a double value so a cast is required).
 * * * - Indicate in your code where Autoboxing and Auto-unboxing are taking place.
 * * * - Use an enhanced for loop to traverse the array and display the contents of the ArrayList.
 * * * - Remove an element from the array and use an enhaced for loop to display the contents.
 * * * - Convert the ArrayList to a LinkedList & re-run the code.
 */
public class ArrayList_Store {
    public static void main(String[] args) {
        int ran = 0; // declare int type ran variable and initialise;
        // create a new ArrayList object, Integer is element type
        // 创建 ArrayList对象 Integer是数组元素类型， list是List
        List<Integer> list = new ArrayList<>();
        System.out.print("Random numbers: ");
        // use for() loop to generate 10 random numbers
        // use a standard for loop to populate the ArrayList using the Math.random().
        for (int x = 0; x <= 10; x++) {
            ran = (int) (Math.random() * 100); // use (int) to cast
            System.out.print(ran + ",");
            list.add(ran); // Autoboxing and populate the ArrayList using list.add() method.
            //list.add(Integer.valueOf(ran)); // Wrapper
            // ran is autoboxed through method invocation(rant是通过方法自动装箱)
        }
        System.out.println("\n");
        System.out.println("==============ArrayList Output==============");
        output(list); // call the output() method and pass in the list object(as the argument to the method)
        // 调用output（）方法并传入list对象（作为方法的参数）
        System.out.println("\n");
        // create a new LinkedList object named linkedList, Integer is element type
        // and convert the ArrayList to a LinkedList // 构造函数
        List<Integer> linkedList = new LinkedList<>(list);
        System.out.println("==============LinkedList Output==============");
        output(linkedList); // call the output() method and pass in the linkedList object(as the argument to the method)
    }

    // output() method provides traverse and output the array method, remove an element from the array.
    public static void output(List<Integer> list) {
        list.remove(0); // Remove an element from the array
        int temp = 0; // declare int type temp variable and initialise.
        System.out.print("Remove after:  ");
        // Use an enhanced for loop to traverse the array
        for (Integer x : list) {
            temp = x;  // Auto-unboxing. Integer type x convert to int type temp.
            System.out.print("[" + temp + "]" + ","); // output the contents of the ArrayList
        }
    }
}
