package Assignment7;

/**
 * @author Weichen Wang
 * @date 2018/11/7 - 5:12 PM
 */
// 各个不同形状抽象出统一的接口 ShapesRelate
// ShapesRelate接口定义一个共同的方法 compareShapes() 去比较
// 然后Circle & Rectangle 都实现这个方法
public interface ShapesRelate   {
    // 接口内的方法
    // 1. Interface 内的所有方法自动被声明为public(只能为public),显示声明为protected,private编译会报错
    // 2. 接口中可以定义"成员变量"，(不可变的常量）, 因为接口中的"成员变量"为自动变为 'public static final'.可以通过类名直接访问(ImplementClass.name)
    // 3. 接口中不存在实现的方法
    // 4. 实现接口的非抽象类必须要实现该接口的所有方法。抽象类可以不用实现
    // 5. 不能用new实例化一个接口，但可以声明一个接口变量，该变量必须引用一个实现该接口的类的对象。
    // 6. 实现多接口的时候一定要避免方法名的重复
    // 抽象类是对Class抽象，接口是对行为的抽象。(抽象类是对整个类进行抽象，包括属性，行为)(接口是对类的局部(行为)抽象)

    public int compareShapes(ShapesRelate sr);
}
