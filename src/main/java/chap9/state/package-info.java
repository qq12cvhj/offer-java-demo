package chap9.state;


/**
 *
 状态模式

        指给对象定义不同的状态，并为不同的状态定义不同的行为，在对象的状态发生变换时自动切换状态的行为。

    状态模式是一种对象行为模式，它将对象的不同行为封装到不同的状态中，遵循了“单一职责”原则。
    同时，状态模式基于对象的状态将对象行为进行了明确的界定，减少了对象行为之间的相互依赖，方便系统的扩展和维护。

    状态模式在生活中很常见，如工作状态、休假状态; 出差、会议、工作中等状态;
    每种状态都对应不同的操作

    状态模式把环境改变的对象行为包装在不同的状态对象里，用于让一个对象在其内部状态改变时，行为也随之改变。

    角色：
        环境(Context): 也叫做上下文，用于维护对象当前的状态，并在对象状态发生变化时出发对象行为的变化。
        抽象状态(AbstractState): 定义了一个接口，用于定义对象中不同状态所对应的行为。
        具体状态(Concrete State): 实现抽象状态所定义的行为。
 *
 *
 * */