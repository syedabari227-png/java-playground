package com.github.pawelhenek.javaplayground.ocp_professional.java_fundamentals;

interface House2 {
    public default String getAddress() {
        return "101 Main Str";
    }
}

interface Office2 {
    public static String getAddress() {
        return "101 Smart Str";
    }
}

interface WFH extends House2, Office2 {
    private boolean isOffice() {
        return true;
    }
}

class HomeOffice2 implements House2, Office2 {
    public String getAddress() {
        return "R No 1, Home";
    }
}

public class TestClass3 {
    public static void main(String[] args) {
        Office off = new HomeOffice();  //1

        System.out.println(off.getAddress()); //2
    }
}