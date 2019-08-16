package com.github.pawelhenek.javaplayground.java_fundamentals;

import java.util.Date;

public final class Final_Classes {

    private void printSomething() {
        System.out.println("Something ... today is " + new Date());
    }

    public static void main(String[] args) {
        var f = new Final_Classes();
        f.printSomething();
    }
}

class Non_Final_Class {
    public final void finalMethod() {

    }
}

class Another_Non_Final_Class extends Non_Final_Class {
    // it works
}

// Won't work
//class Another_Final_Class extends Final_Classes {
//
//}

// Won't work
//abstract final class Final_Classes {
//
//}