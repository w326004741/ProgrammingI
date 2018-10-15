package Collection;

/**
 * @author Weichen Wang
 * @date 2018/10/11 - 下午2:35
 */
public class Recursion {

    public static void main(String[] args) {
        System.out.println(sum(100));
        System.out.println(sum(200));
    }

    public static int sum(int num) {
        if (num == 1) {
            return 1;
        }
        return num + sum(num - 1);
    }
}

//    public static void main(String[] args) {
//        count(0);
//        System.out.println();
//    }
//
//    public static void count(int index) {
//        System.out.print(index + " ");
//        if (index < 2) {
//            count(index + 1);
//        }
//    }
