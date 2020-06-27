package com.github.pawelhenek.javaplayground.ocp_professional.java_fundamentals;

public interface Measurement {

    public default int getLength() {
        System.out.println("getting length");
        return 10;
    }
    public default int getBreadth() {
        System.out.println("getting length");
        log("getting length");
        return 20;
    }

    static void log(String msg) {
        System.out.println(msg);
    }
}
