package Assessment4;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * @author Weichen Wang
 * @date 2018/10/17 - 下午11:12
 * @descibe: Write a Java application which uses an ArrayList to stores Integer values. You are required to:
 * * - Use a standard for loop to populate the ArrayList using the Math.random()
 * * (remember this returns a double value so a cast is required).
 * * - Indicate in your code where Autoboxing and Auto-unboxing are taking place.
 * * - Use an enhanced for loop to traverse the array and display the contents of the ArrayList.
 * * - Remove an element from the array and use an enhaced for loop to display the contents.
 * * - Convert the ArrayList to a LinkedList & re-run the code.
 */
public class LinkedList_Storage {
    public static void main(String[] args) {
        System.out.println("==============LinkedList_Storage================");
        // 创建LinkedList对象， Integer是元素类型 list为list
        LinkedList<Integer> list = new LinkedList<>();
        random(list); // call random() method
    }

    // use a standard for loop to populate the LinkedList using the Math.random().
    public static void random(LinkedList<Integer> list) {
        // (int) cast double
        int random = (int) (Math.random() * 100);// 随机数为double类型，且默认范围是0-1，所以*100是为取两位数的随机整数
        System.out.print("random number is : " + random + "\n"); // 输入随机数数值
        System.out.print("random num collection: "); // 输出遍历随机数数值，从1开始，到随机数结束
        for (int x = 1; x <= random; x++) {
            System.out.print(x + ",");
            list.add(x); // Autoboxing 自动装箱 全部遍历数值
        }
        System.out.println();
        System.out.println("Autoboxed: " + list); // 输出自动装箱后的list内容

        // remove the first element from the list. 删除list数组内的第一个元素
        list.removeFirst();
//        list.removeLast(); //删除list数组内的最后一个元素
//        list.remove(2);    // 删除list中index索引为2的元素。

        int temp = 0;  // 定义一个Int类型的变量temp，用于自动拆箱时的类型转换（Integer —> int）
        System.out.println("After Remove: ");
        System.out.print("Auto-unboxing: ");  // 输入拆箱后的数值
        // 遍历list数组 并把Integer 拆箱传给int型的total
        // Use an enhanced for loop to traverse the array and display the contents of the LinkedList.
        for (Integer x : list) {
            temp = x;
            System.out.print("[" + temp + "]" + ",");
        }
    }
}
//    public static void main(String[] args) {
//        LinkedList<String> lList = new LinkedList<>();
//        lList.add("1");
//        lList.add("2");
//        lList.add("3");
//        lList.add("4");
//        lList.add("5");
//        lList.addFirst("7");
//        lList.addLast("9");
//
//        System.out.println("链表的第一个元素是： " + lList.getFirst());
//        System.out.println("链表的最后一个元素是： " + lList.getLast());
//
//
//        for (String str : lList) {
//            System.out.print(str + ",");
//        }
//        System.out.println();
//
//        // 从链表生成子表
//        // subList(from index, to index)
//        List subl = lList.subList(1, 4);
//        System.out.println(subl);
//        subl.remove("3");
//        System.out.println(subl);
//        System.out.println(lList);
//    }
