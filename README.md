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
