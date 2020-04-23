package chap9.observer;

/**
 *
 观察者(Observer)模式
        指在被观察者的状态发生变化时，系统基于事件驱动理论将其状态通知到订阅其状态的观察者对象中，以完成状态的修改和事件传播。
        这种模式有时又叫做发布-订阅模式或模型-视图模式

    是一种对象行为型模式，观察者和被观察者之间的关系属于抽象耦合关系，主要优点是在观察者与被观察者之间建立了一套事件触发机制，以降低二者时间的耦合度。

    主要角色：
        抽象主题(Subject): 持有订阅了该主题的观察者对象的集合，同时提供了增加、删除观察者对象的方法和主题状态发生变化后的通知方法。
        具体主题(Concrete Subject): 实现了抽象主题的通知方法，在主题的内部状态发生变化时，调用该方法通知订阅了主题状态的观察者对象。
        抽象观察者(Observer): 观察者的抽象类或接口，定义了主题状态发生变化时需要调用的方法。
        具体观察者(Concrete Observer): 抽象观察者的实现类，在收到主题状态变化的信息后执行具体的触发机制。
 * */