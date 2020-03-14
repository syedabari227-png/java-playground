package com.github.pawelhenek.javaplayground.ocp_professional.java_fundamentals;

public class Member_Inner_Class {

    class Inner_Class {
        public void sayBonjour() {
            System.out.println("Inner_Class.sayBonjour");
        }
    }

    public static void main(String[] args) {

        Member_Inner_Class member_Inner_Class = new Member_Inner_Class();
        Inner_Class inner_class = member_Inner_Class.new Inner_Class();
        inner_class.sayBonjour();
    }
}
