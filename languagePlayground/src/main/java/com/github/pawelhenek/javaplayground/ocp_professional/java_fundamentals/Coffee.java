package com.github.pawelhenek.javaplayground.ocp_professional.java_fundamentals;

import java.util.List;

enum Coffee {
    ESPRESSO("Very Strong"), MOCHA("Bold"), LATTE("Mild");
    public String strength;

    Coffee(String strength) {
        this.strength = strength;
    }

    public String toString() {
        return strength;
    }

    public static void main(String[] args) {
        List.of(Coffee.values()).stream().forEach(e->{System.out.print(e.name()+":"+e+", ");});
    }
}