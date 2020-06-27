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

             case OFF: System.out.println("3"); break;
        }


    }
}
