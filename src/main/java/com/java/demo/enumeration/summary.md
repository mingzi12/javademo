1、java枚举原理
在使用关键字enum创建枚举类型并编译后，编译器会为我们生成一个相关的类，这个类继承了Java API中的
java.lang.Enum类，也就是说通过关键字enum创建枚举类型在编译后事实上也是一个类类型而且该类继承自java.lang.Enum类。
编译后会生成一个数组，数组中的对象就是定义的枚举类的实例，这样就可以使用生成的枚举实例了。

2、参考链接
https://blog.csdn.net/javazejian/article/details/71333103