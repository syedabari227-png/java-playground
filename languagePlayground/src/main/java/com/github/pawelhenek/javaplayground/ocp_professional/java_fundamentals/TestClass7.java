package com.github.pawelhenek.javaplayground.ocp_professional.java_fundamentals;

public class TestClass7 {
    public class A {
    }

    public static class B {
    }

    public void useClasses() {
        new TestClass7().new A();
        new TestClass7.B();
        new A();
        new TestClass7.A();
     }
}