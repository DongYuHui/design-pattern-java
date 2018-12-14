## 简介 ##

**观察者模式**概念：
定义对象间的一种一对多依赖关系，使得每当一个对象状态发生改变时，其相关依赖对象皆得到通知并被自动更新。

## 图例 ##

### UML ###

![ObserverUML](./ObserverUML.jpg "Observer UML")

### 时序图 ###

![ObserverSequenceDiagram](./ObserverSeq.jpg "Observer Sequence Diagram")

## 示例 ##

### 示例1 ###

示例 1 来源于《HeadFirst 设计模式》书中案例。

### 示例2 ###

示例 2 来源于 Java 内置的观察者模式。该中方式自 Java9 开始被设置为 Deprecated，因为有几个原因：不可序列化、没有线程安全等。而是采用 Flow 的 Rx 方式实现，具体可参见代码。