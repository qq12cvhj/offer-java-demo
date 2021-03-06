package chap9.flyweight;

/**
 *
 享元模式(Flyweight Pattern)
        主要通过对象的复用来减少对象创建的次数和数量，以减少系统内存的使用和降低系统的负载。
        享元模式属于结构型模式，在系统需要一个对象时享元模式首先在系统中查找并尝试重用现有的对象，如果未找到匹配的对象，
        则创建新对象并将其缓存在系统中以便下次使用。

        享元模式主要用于避免在有大量对象时频繁创建和销毁对象造成系统资源的浪费，把其中共同的部分抽象出来，
        如果有相同的业务请求，则直接返回内存中已有的对象，避免重新创建。
 *
 *
 * */