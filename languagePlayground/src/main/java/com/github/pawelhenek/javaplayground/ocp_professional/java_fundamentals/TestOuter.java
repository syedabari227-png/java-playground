package com.github.pawelhenek.javaplayground.ocp_professional.java_fundamentals;

public class TestOuter {

    public void myOuterMethod()    {
        new TestInner();
     }

     public class TestInner { }
     public static void main(String[] args)    {
        TestOuter to = new TestOuter();
        new TestOuter().new TestInner();
     }
}