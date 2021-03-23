package com.orchid.wind.demo.test;

public class Test {

    public static void main(String[] args) {
        class Foo {
            int i = 3;
        }
        Object o = (Object) new Foo();
        Foo foo = (Foo) o;
        System.out.println(foo.i);
    }
}