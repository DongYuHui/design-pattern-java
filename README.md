# Design Pattern in Java

## 说明 ##

学习设计模式[《HeadFirst 设计模式》](https://book.douban.com/subject/2243615/)，记录学习过程

## 章节 ##

1. [策略模式](./src/main/resources/strategy.md "策略模式")

策略模式指对象有某个行为，但是在不同的场景中，该行为有不同的实现算法。

2. [观察者模式](./src/main/resources/observer.md "观察者模式")

观察者模式定义了一种一对多的依赖关系，让多个观察者对象同时监听某一个主题对象。这个主题对象在状态上发生变化时，会通知所有观察者对象，使它们能够自动更新自己。

3. [单例模式](./src/main/resources/singleton.md "单例模式")

在应用这个模式时，单例对象的类必须保证只有一个实例存在。许多时候整个系统只需要拥有一个的全局对象，这样有利于我们协调系统整体的行为。

4. [装饰者模式](./src/main/resources/decorator.md "装饰者模式")

一种动态地往一个类中添加新的行为的设计模式。

5. [工厂模式](./src/main/resources/factory.md "工厂模式")

工厂模式包含简单工厂模式、工厂方法模式、抽象工厂模式三类创建型模型。

6. [代理模式](./src/main/resources "代理模式")

为其他对象提供一种代理以控制对这个对象的访问。