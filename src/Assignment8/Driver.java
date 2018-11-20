package Assignment8;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Weichen Wang
 * @date 2018/11/14 - 12:02 PM
 * // Both SalesAgent and SalesPerson types are to be stored into ArrayList.
 * Should calculate and display the
 * 1. employee first name & last name  (☑️🆗⭕️)
 * 2. PPS number(☑️🆗⭕️)
 * 3. total value of each sale 每笔销售的总价值
 * 4. amount of commission paid to each employee(based on sales figures entered by the user)
 * 支付给每位员工的佣金金额（根据用户输入的销售数字）
 * <p>
 * The application should also include methods that:
 * 1. Serialize the ArrayList to file called EmployeeInfo.dat (☑️🆗⭕️)
 * 2. Deserialize and display the content of the EmployeeInfo.dat file(☑️🆗⭕️)
 * 3. Write the contents fo the ArrayList to text file called EmployeeList.txt(☑️🆗⭕️)
 * 4, Read and display the contents of the EmployeeList.txt text file.(☑️🆗⭕️)
 */
public class Driver {
    public static void main(String[] args) {
        String path = "EmployeeInfo.dat";
        // create a new ArrayList object, employees as List, SalesEmployee as element type.
        List<SalesEmployee> employees = new ArrayList<>();
        // create a new reference and refer to the input stream
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number of the employees: ");
        int numberOfEmployees = sc.nextInt(); // .nextInt() only reads in until it's found the int and then stops
        sc.nextLine();
        // add the amount of employees enter by the user
        for (int i = 0; i < numberOfEmployees; i++) {
            SalesEmployee employee;

            menu(); // call menu() method to display the content of menu
            int type = sc.nextInt(); // .nextInt() only reads in until it's found the int and then stops
            sc.nextLine();

            System.out.println("Please inform employee first name: ");
            String firstName = sc.nextLine();

            System.out.println("Please inform employee last name: ");
            String lastName = sc.nextLine();

            System.out.println("Please inform employee PPS number: ");
            String ppsNumber = sc.nextLine();

            System.out.println("Please inform employee total sale amount: ");
            double totalSalesAmount = sc.nextDouble();
            sc.nextLine();
            // the employees type by the user
            if (type == 1) {
                // For Sales Agent, create new SalesAgents and assign the values to employee
                employee = new SalesAgent(firstName, lastName, ppsNumber);
                employee.sales = totalSalesAmount; // totalSalesAmount by the user type for sales of employee
                employee.calculateCommission();
                employees.add(employee); // SalesAgent stored into an ArrayList(employees)
            } else if (type == 2) {
                // For Sales Person, create new SalesPerson and call setter method to set values for SalesPerson and assign values to employee
                employee = new SalesPerson();
                employee.setFirstName(firstName);
                employee.setLastName(lastName);
                employee.setPpsNumber(ppsNumber);
                employee.sales = totalSalesAmount; // totalSalesAmount by the user type for sales of employee
                employee.calculateCommission();
                employees.add(employee); // SalesPerson stored into an ArrayList(employees)
            }
            System.out.println();
        }

        System.out.println("=======Employee Array=========");
        // call arrayListOutput() method to traverse the ArrayList(employees) and output
        arrayListOutput(employees);
        // 1. call serialize() method to serialize the ArrayList(employees) to a file called EmployeeInfo.dat.
        System.out.println("=========Serialize=========");
        serialize(employees, path);
        // 2. call deserialize() method to deserialize and display the contents of the EmployeeInfo.dat file
        System.out.println("=========Deserialize=========");
        deserialize(employees, path);
        // 3. call fileWrite() method to write the content of the ArrayList(employees) to a text file called EmployeeList.txt
        System.out.println("=========File Write=========");
        fileWrite(employees);
        // 4. call fileReader() method to read and display the contents of the EmployeeList.txt text file
        System.out.println("=========File Read=========");
        fileReader(employees);
    }

    // Output of ArrayList
    public static void arrayListOutput(List<SalesEmployee> employees) {
        // Use an enhanced for loop to traverse the array
        for (SalesEmployee employee : employees) {
            System.out.println(employee.toString());
        }
    }

    // 1. Serialize the ArrayList to a file called EmployeeInfo.dat.
    public static void serialize(List<SalesEmployee> employees, String path) {
        try {
            // Serialization 序列化 如果父类实现了Serialization，子类自动序列化,就不需要implement Serialization
            // Create a connection stream (write bytes)连接表示与源或目标（文件，套接字等）的连接（低级别字节）
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            // create a chain stream (allows objects to be written to a stream)链流不能自己连接，必须链接到连接流（高级对象到数据）
            ObjectOutputStream os = new ObjectOutputStream(fileOutputStream);
            // call writeObject() on the Object Stream
            // writeObject(): 用来处理对象的序列化。如果声明该方法，它会被ObjectOutputStream调用，而不是默认的序列化进程；
            os.writeObject(employees);
            System.out.println("Serialization Successfully!\n");
            os.close();// call close() to close Object Stream.
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 2. Deserialize and display the contents of the EmployeeInfo.dat file
    public static void deserialize(List<SalesEmployee> employees, String path) {
        try {
            // create a connection stream(Read bytes)
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fileInputStream);
            // 从输入流中读取一个Object，并将其强制类型转换为List<SaleEmployee>对象
            List<SalesEmployee> employees1 = (List<SalesEmployee>) ois.readObject();
            // Use an enhanced for loop to traverse the array
            for (SalesEmployee element : employees1) {
                System.out.println(element.toString());
            }
            System.out.println("Deserialize Successfully!!!\n");
            ois.close();// call close() to close Object Steam
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 3. Write the content of the ArrayList to a text file called EmployeeList.txt
    public static void fileWrite(List<SalesEmployee> employees) {
        try {
            FileWriter fileWriter = new FileWriter("EmployeeList.txt");
            BufferedWriter writer = new BufferedWriter(fileWriter);
            writer.write("Employee List: \n");
            for (SalesEmployee element : employees) {
                writer.write(element.toString() + ".\n");
            }
            // 添加判断条件，对element
            //if ()
            System.out.println("Write Successfully!!\n");
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //4. Read and display the contents of the EmployeeList.txt text file
    public static void fileReader(List<SalesEmployee> employees) {
        System.out.println("Display the contents of the EmployeeList.txt text file follow below: ");
        try {
            File employeeFile = new File("EmployeeList.txt");
            // A FileReader is a connection stream for characters that connects to a text file
            // FileReader是连接到文本文件的字符的连接流
            FileReader fileReader = new FileReader(employeeFile);
            // Chain the "FileReader" to a BufferedReader for more efficient reading.
            // It'll go back to the file to read only when the buffer 78uis empty(because the program has read everything in it).
            // 将“FileReader”链接到BufferedReader以获得更高效的读取。它将返回到文件只在缓冲区为空时读取（因为程序已读取其中的所有内容）
            BufferedReader reader = new BufferedReader(fileReader);

            String line = null;
            // Read happens by reading lines in with a while loop, which ends when the result fo a readLine() is null
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                // This says, "Read a line of text, and assign it to the String variable 'line'. While that variable is not null
                // (because there WAS something to read) print out the line that was just read"
                // Or another way of saying it, "While there are still lines to read them and print them"
                // 这就是说，“读取一行文本，并将其分配给String变量'line'。虽然该变量不为null（因为有东西要读），打印出刚读过的行”。
                // 或者另一种说法，“虽然仍有线条可以阅读并打印出来”
            }
            System.out.println("==============Read Successfully!!==============");
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void menu() {
        System.out.println("===================================");
        System.out.println("Please select the employee type: ");
        System.out.println("1. Sales Agent");
        System.out.println("2. Sales Person");
        System.out.println("===================================");
    }
}