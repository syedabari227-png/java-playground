package com.github.pawelhenek.javaplayground.ocp_professional.java_fundamentals;

public class Enums {

    public static void main(String[] args) {

        System.out.println(InnerEnum.ONE);

        System.out.println(InnerEnum.values().length);

        System.out.println(ExternalEnum.ONE);

        System.out.println(ExternalEnum.valueOf(ExternalEnum.class, "ASD"));
    }

    enum InnerEnum {
        ONE, TWO
    }

}

enum ExternalEnum {
    ONE, TWO
}
