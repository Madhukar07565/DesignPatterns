package com.madhu.designpattern.Singleton;

import java.lang.reflect.Constructor;

/**
 * @author Madhukar Reddy
 *
 */
public class BreakSingletonPattern {

    /**
     * @param args
     * @throws Exception
     * 
     *             we can break the singleton design pattern by using the rel=flection API.
     * 
     */
    public static void main(String[] args) throws Exception {

        SingletonDesignPattern s = SingletonDesignPattern.getInstance();

        SingletonDesignPattern s1 = SingletonDesignPattern.getInstance();

        SingletonDesignPattern s2 = null;

        System.out.println("Before breaking the singleton design pattern");
        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());
        System.out.println(s.equals(s1));

        Constructor[] declaredConstructors = SingletonDesignPattern.class.getDeclaredConstructors();

        for (Constructor constructor : declaredConstructors) {
            constructor.setAccessible(true);
            s2 = (SingletonDesignPattern) constructor.newInstance();
        }
        System.out.println("after breaking the singleton design pattern");
        System.out.println(s.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s.equals(s2));
    }

}
