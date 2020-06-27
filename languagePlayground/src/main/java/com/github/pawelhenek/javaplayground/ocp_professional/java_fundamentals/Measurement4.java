package com.github.pawelhenek.javaplayground.ocp_professional.java_fundamentals;

interface Measurement4 {
    public int getLength();
    public static int getBreadth()
    {
        return 0;
    }
    private void helper(){}
}

interface Size extends Measurement4 {

    private void helper() {
    }
}