package com.github.pawelhenek.javaplayground.ocp_professional.java_fundamentals;

public class TestClass5 extends Thread
{
    class Runner implements Runnable
    {
        public void run()
        {
            Thread[] t = new Thread[5];
            for(int i=0; i<t.length; i++) System.out.println(t[i]);
        }
    }

    public static void main(String args[]) throws Exception
    {
        TestClass tc = new TestClass();
        // won't compile
        // new Thread( tc.new Runner() ).start();
    }
}