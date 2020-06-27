package com.github.pawelhenek.javaplayground.ocp_professional.java_fundamentals;

public class TopClass {
    public Inner inner1 = new Inner() {
        public void doA() {
            System.out.println("doing A");
        }
    };
// wont compile
//    public void doA() {
//        inner1.doA();
//    }
}

class Inner {
    int value;
}