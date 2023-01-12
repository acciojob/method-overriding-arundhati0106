package com.driver;

public class B extends A {
//    public B() {
//        B object1 = new B();
//    }

    @Override
    public String meth() {
        super.meth();
        return "Method is overridden in Extendend class B";
    }
}
