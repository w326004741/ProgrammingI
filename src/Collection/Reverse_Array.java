package Collection;

/**
 * @author Weichen Wang
 * @date 2018/10/8 - 下午12:08
 * @Description: Reverse 转置数组
 */
public class Reverse_Array {
    public static void main(String[] args) {
        // 声明并实例化数组统一在main()方法内实现
        int[] data = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("Original array: ");
        output(data);
        reverse(data); // 算法输出统一在main()方法内输出
        System.out.println("Result of after reverse: ");
        output(data);
    }

    // 转制/逆转数组算法 （算法内部不需要输出语句，统一在main()方法内输出）
    public static void reverse(int arr[]) {
        int len = arr.length / 2;  // 转置的次数
        int head = 0;              // 头部index/角标
        int tail = arr.length - 1; // 尾部index/角标
        // Reverse Algorithms
        for (int x = 0; x < len; x++) {
            int storage = arr[head]; // head -> storage(head 空，storage[head])
            arr[head] = arr[tail]; // tail -> head (tail 空, head[tail] )
            arr[tail] = storage; // storage[head] -> tail[] )
            head++; // head index ++ (h1,h2,h3...)
            tail--; // tail index -- (h7,h6,h5...)
        }
    }

    // 专门定义一个输出的功能的方法, （for循环依次输出每个数组中的值。）
    public static void output(int temp[]) {
        for (int x = 0; x < temp.length; x++) {
            System.out.print(temp[x] + ",");
        }
        System.out.println();
    }
}
