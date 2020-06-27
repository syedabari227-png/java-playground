package com.github.pawelhenek.javaplayground.ocp_professional.java_fundamentals;

interface Measurement2 {

    public default int getLength() {
        return 0;
    }

    public static int getBreadth() {
        return 0;
    }
}

// dont compile
//interface Size extends Measurement2 {
//    public static final int UNIT = 100;
//
//    public static int getLength() {
//        return 10;
//    }
//}