package com.github.pawelhenek.javaplayground.ocp_professional.java_fundamentals;

public class Onion {
    private String data = "skin";

    private class Layer extends Onion {
        String data = "thegoodpart";
        // static String d = ""; // Does not compile

        public String getData() {
            return data;
        }
    }

    public String getData() {
        return new Layer().getData();
    }

    public static void main(String[] args) {
        Onion o = new Onion();
        System.out.println(o.getData());
    }
}