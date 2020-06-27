package com.github.pawelhenek.javaplayground.ocp_professional.java_fundamentals;

interface Eatable {
    int types = 10;
}
class Food implements Eatable {
    public static int types = 20;
}
public class Fruit extends Food implements Eatable{

    public static void main(String[] args) {
        //types = 30; // Error:(12, 9) java: reference to types is ambiguous
        //System.out.println(types);
    }
}

