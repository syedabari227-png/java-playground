package com.github.pawelhenek.javaplayground.ocp_professional.java_fundamentals;

public enum Switch {
    ON, OFF
}

class A {
    public static void main(String[] args) {
        Switch s = Switch.ON;;

        if (s == Switch.ON) {
            System.out.println("1");
        }

        if (s.equals(Switch.ON)) {
            System.out.println("2");
        }

        switch(s) {
            // case Switch.OFF: System.out.println("3"); break; do not compile
            // case Switch.OFF.valueOf() : System.out.println("It is off!"); break; do not compile
            // case OFF.toString() : System.out.println("It is off!"); break; do not compile
            //  1: System.out.println("3"); break;

            case OFF: System.out.println("3"); break;
        }

        switch ("ABC") {
            // won't compile
            //case 123: System.out.println("abc"); break;
            case "abc": System.out.println("abc"); break;
            case "ABC": System.out.println("ABC"); break;
            default: System.out.println("default");
        }

        switch (123) {
            // won't compile
            //case "abc": System.out.println("abc"); break;
            //case 123L: System.out.println("ABC"); break;
            //case 123d: System.out.println("ABC"); break;
            case 1: System.out.println("1"); break;
            default: System.out.println("default");
        }
    }
}
