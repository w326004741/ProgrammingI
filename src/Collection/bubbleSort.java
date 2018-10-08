package Collection;

/**
 * @author Weichen Wang
 * @date 2018/10/8 - 下午12:02
 * @decrible 冒泡排序法 题目：请编写一个数组排序操作
 */
public class bubbleSort {
    public static void main(String[] args) {
        int[] data = new int[]{2, 1, 9, 0, 5, 4, 7, 6, 8};
        System.out.print("Original array: ");
        output(data);
        System.out.println();
        sort(data); // 调用sort()方法
        System.out.print("Result of after sort: ");
        output(data); //输出排序后的结果

    }

    // sort()方法负责排序数组，减少main()方法内的代码量，简洁
    // 把排序算法写入sort()方法中，不要写在main()方法中，减少main()代码量
    public static void sort(int arr[]) {
        // 外层控制排序次数（只要排序次数达到了 长度*长度(x*y)，就一定排完了）（类似于9*9乘法表）
        for (int x = 0; x < arr.length; x++) {
            // 内层控制每次排序的控制
            // (IF()判断当前位置的数值是否大于后一位的数值，如果是大于，则两者交换顺序并重新排序
            // 直到整个数组的数值从前到后依次大于，则退出循环)
            for (int y = 0; y < arr.length - 1; y++) {
                if (arr[y] > arr[y + 1]) {
                    int t = arr[y];
                    arr[y] = arr[y + 1]; // 1 -> 3, 2 -> 1, 3 -> 2
                    arr[y + 1] = t;
                }
            }
        }
        //output(arr);
    }

    // 定义一个输出的功能的方法
    public static void output(int temp[]) {
        for (int x = 0; x < temp.length; x++) {
            System.out.print(temp[x] + ",");
        }
        System.out.println();
    }
}
