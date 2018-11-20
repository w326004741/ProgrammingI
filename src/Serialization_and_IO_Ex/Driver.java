package Serialization_and_IO_Ex;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;

/**
 * @author Weichen Wang
 * @date 2018/11/14 - 12:52 PM
 */
public class Driver {
    public static void main(String[] args) {
        String path = "EmployeeInfo.dat";

        Person p1 = new Person("Jerry", 22);

        try {
            // Serialization
            // Create a connection stream (write bytes)连接流表示与源或目标（文件，套接字等）的连接（低级别字节）
            FileOutputStream fileStream = new FileOutputStream(path);
            // create a chain stream (allows objects to be written to a stream)链流不能自己连接，必须链接到连接流（高级对象到数据
            ObjectOutputStream os = new ObjectOutputStream(fileStream);
            // call writeObject() on the Object stream
            os.writeObject(p1);
            os.close();

            // Deserialization 反序列化 把对象恢复到原来的状态
            //
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fileInputStream);

//            List<Employee> emp = (List<Employee>) ois.readObject();
            Person p2 = (Person) ois.readObject();
            ois.close();
            System.out.println("p2" + p2);
            System.out.println("p1 === p2 is: " + (p1 == p2));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
