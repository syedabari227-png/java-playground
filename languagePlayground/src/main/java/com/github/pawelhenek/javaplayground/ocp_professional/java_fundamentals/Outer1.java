package com.github.pawelhenek.javaplayground.ocp_professional.java_fundamentals;

public class Outer1 {

    private double d = 10.0;

// do not compile
//    class Inner {   
//        public void m1() {
//         this.d = 20.0;  
//    }

    abstract class Inner
    {
     public void ml() { d = 20.0; }
    }
    final class Inner2
    {
     public void ml() { d = 20.0; }
    }
    private class Inner3
    {
     public void ml() { d = 20.0; }
    }
}
