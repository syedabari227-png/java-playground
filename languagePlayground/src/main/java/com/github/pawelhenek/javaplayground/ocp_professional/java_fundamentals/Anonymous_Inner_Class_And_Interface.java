package com.github.pawelhenek.javaplayground.ocp_professional.java_fundamentals;

abstract class Anonymous_Abstract_Class {
    public abstract void sayAnything();
}

interface Anonymous_Interface {
    void sayIamInterface();
}

public class Anonymous_Inner_Class_And_Interface {

    public static void main(String[] args) {
        Anonymous_Abstract_Class anonymous_abstract_class = new Anonymous_Abstract_Class() {
            @Override
            public void sayAnything() {
                System.out.println("Anonymous_Inner_Class_And_Interface.Abstract_Class.sayAnything");
            }
        };
        anonymous_abstract_class.sayAnything();

        Anonymous_Interface anonymousInterface = new Anonymous_Interface() {
            @Override
            public void sayIamInterface() {
                System.out.println("Anonymous_Inner_Class_And_Interface.Interface.sayIamInterface");
            }
        };
        anonymousInterface.sayIamInterface();
    }
}

