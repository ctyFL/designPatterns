# designPatterns
Java设计模式简单示例

**Observer**——观察者模式：主题（实现Subject接口）的数据得到更新，需要推送时（视具体情况而定），就会把数据分享给所有注册为观察者的类（实现Observer接口，并在主题中注册），不同的观察者也可以只get自己需要的数据；

**Decorator**——装饰者模式：在不改变对象自身的基础上，在程序运行期间给对像动态的添加职责。与继承相比，装饰者是一种更轻便灵活的做法。
装饰者模式的特点:可以动态的给某个对象添加额外的职责，而不会影响从这个类中派生的其它对象；

**Factory**——工厂模式：

1.**SimpleFactory**——简单工厂：简单工厂不能算一种设计模式，更像一种编程习惯，但是它的运用很广。提供一个创建对象实例的功能，而无须关心其具体实现，将程序与具体类解耦；
    
2.**Factory**——工厂模式：定义一个抽象的创建者类，并定义创建产品对象（抽象产品）的接口，但由子类决定要实例化的类是哪一个，工厂方法让类把实例化延迟到子类。（创建者通常包含依赖抽象产品的代码——对抽象产品的一些操作，而抽象产品具体是什么产品由子类去创造，创建者不需要知道在制造哪种具体的产品）；

3.**AbstractFactory**——抽象工厂：提供一个接口，用于创建相关或依赖对象的家族，而不需要明确知道具体类；


**Singleton**——单例模式：确保一个类只有一个实例，并提供一个全局访问点；

**Command**——命令模式：将“请求”封装成对象（指命令对象—实现了命令接口的对象）以便使用不同的请求、队列或者日志来参数化其他对象，命令模式也支持可撤销的操作。 

   “参数化类型”——利用java泛型，将类型由原来的具体的类型参数化，类似于方法中的变量参数，此时类型也定义成参数形式（可以称之为类型形参），然后在使用/调用时传入具体的类型（类型实参）。
   
   命令对象中，绑定一个实际执行该方法的对象（执行者、接收者-Receiver），将接收者和接收者的具体动作封装进来，只暴露出一个execute()方法，当此方法被调用时，就会执行接收者的动作。这样，当调用者（Invoker）对象调用命令对象的execute()方法时，不需要知道是哪个接收者接收到了请求命令，也不需要知道接收者执行了哪些动作。

   通过一个抽象基类的命令接口类，可以扩展出许多具体的命令类，这样就只需要使用接口类对象来参数化调用者对象即可。调用者对象不需要知道具体的命令，只知道他是一个命令即可。

   可以通过命令模式来实现“队列、日志和支持撤销操作”。

优点： 1、降低了系统耦合度。 2、新的命令可以很容易添加到系统中去。

缺点：使用命令模式可能会导致某些系统有过多的具体命令类。

**Template**——模板方法模式：在一个方法中定义一个算法的骨架，而将一些步骤延迟到子类中。模板方法使得子类可以在不改变算法结构的情况下，重新定义算法中的某些步骤。

**Iterator**——迭代器模式：提供一种方法顺序访问一个聚合对象中的各个元素，而又不暴露其内部的表示。

**Composite**——组合模式：也称为 整体-部分（Part-Whole）模式，它的宗旨是通过将单个对象（叶子节点）和组合对象（树枝节点）用相同的接口进行表示，使得客户对单个对象和组合对象的使用具有一致性。
    
   它将对象组织到树形结构中，最顶层的节点称为 根节点，根节点下面可以包含 树枝节点 和 叶子节点，树枝节点下面又可以包含 树枝节点 和 叶子节点。

**State**——状态模式：允许对象在内部状态改变时改变它的行为，对象看起来好像修改了它的类。