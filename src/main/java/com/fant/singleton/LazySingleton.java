package com.fant.singleton;

/**
 * 懒汉式 - 线程不安全的（不推荐）
 * 以下实现中，私有静态变量 singleton 被延迟实例化，这样做的好处是，如果没有用到该类，那么就不会实例化 singleton，从而节约资源。
 * 这个实现在多线程环境下是不安全的，如果多个线程能够同时进入 if (singleton == null) ，
 * 并且此时 singleton 为 null，那么会有多个线程执行 singleton = new Singleton(); 语句，这将导致实例化多次 singleton。
 */
public class LazySingleton {

    private static LazySingleton singleton;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (singleton == null) {
            singleton = new LazySingleton();
        }
        return singleton;
    }
}

/**
 * 懒汉式 - 线程安全的（不推荐）
 * 只需要对 getInstance() 方法加锁，那么在一个时间点只能有一个线程能够进入该方法，从而避免了实例化多次 singleton。
 * 但是当一个线程进入该方法之后，其它试图进入该方法的线程都必须等待，即使 singleton 已经被实例化了。
 * 这会让线程阻塞时间过长，因此该方法有性能问题，不推荐使用。
 */
class LazySingletonOfThreadSafe {

    private static volatile LazySingletonOfThreadSafe singleton;

    private LazySingletonOfThreadSafe() {
    }

    public static synchronized LazySingletonOfThreadSafe getInstance() {
        if (singleton == null) {
            singleton = new LazySingletonOfThreadSafe();
        }
        return singleton;
    }
}