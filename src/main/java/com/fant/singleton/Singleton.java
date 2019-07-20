package com.fant.singleton;

/**
 * 双重校验锁-线程安全 （推荐，但是实现逻辑比较难以理解）
 * singleton 只需要被实例化一次，之后就可以直接使用了。
 * 加锁操作只需要对实例化那部分的代码进行，只有当 singleton 没有被实例化时，才需要进行加锁。
 * 双重校验锁先判断 singleton 是否已经被实例化，如果没有被实例化，那么才对实例化语句进行加锁。
 * 使用 volatile 可以禁止 JVM 的指令重排，保证在多线程环境下也能正常运行
 */
public class Singleton {

    private static volatile Singleton singleton;

    private Singleton() {
    }

    public static Singleton getInstance() {
        // 避免 singleton 已经被实例化之后的加锁操作
        if (singleton == null) {
            // 加锁
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}

/**
 * 静态内部类（推荐使用,目前无法使用）
 * 当 Singleton 类被加载时，静态内部类 SingletonHolder 没有被加载进内存。
 * 只有当调用 getsingleton() 方法从而触发 SingletonHolder.INSTANCE 时 SingletonHolder 才会被加载，
 * 此时初始化 INSTANCE 实例，并且 JVM 能确保 INSTANCE 只被实例化一次。
 * 这种方式不仅具有延迟初始化的好处，而且由 JVM 提供了对线程安全的支持。
 */
//class SingletonByInnerClass {
//
//    private SingletonByInnerClass() {
//    }
//
//    private static class SingletonHolder {
//
//        static final SingletonByInnerClass SINGLETON = new SingletonByInnerClass();
//    }
//
//    public static SingletonByInnerClass getInstance() {
//        return SingletonByInnerClass.SingletonHolder;
//    }
//}



