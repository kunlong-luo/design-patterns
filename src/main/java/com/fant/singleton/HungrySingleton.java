package com.fant.singleton;

/**
 * 饿汉式-线程安全（不推荐）
 * 线程不安全问题主要是由于 singleton 被实例化多次，采取直接实例化 singleton 的方式就不会产生线程不安全问题。
 * 但是直接实例化的方式也丢失了延迟实例化带来的节约资源的好处。
 */
public class HungrySingleton {

    private static final HungrySingleton singleton = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return singleton;
    }
}
