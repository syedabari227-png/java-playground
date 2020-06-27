package com.github.pawelhenek.javaplayground.ocp_professional.java_fundamentals;

public class Nested_Classes {

    public static void main(String[] args) {

        Nested_Classes nested_classes = new Nested_Classes();
        nested_classes.sayHi();

        Outer_Class outer_class = new Outer_Class();
        outer_class.sayHello();

        Static_Nested_Class static_nested_class = new Static_Nested_Class();
        static_nested_class.sayVoila();

        Outer_Interface.Inner_Class_Inside_Interface inner_class_inside_interface = new Outer_Interface.Inner_Class_Inside_Interface();
        inner_class_inside_interface.sayElo();

        Outer_Class.Static_Nested_Class_Inside_Outer_Class nested_class_inside_outerclass = new Outer_Class.Static_Nested_Class_Inside_Outer_Class();
        nested_class_inside_outerclass.sayMorning();

        Nested_Classes nested_class = new Nested_Classes();
        nested_class.invokeLocalInnerClass();
    }

    void invokeLocalInnerClass() {
        System.out.println("Nested_Classes.invokeLocalInnerClass");

        class Local_Inner_Class {
            void sayIamLocal() {
                System.out.println("Nested_Classes.Local_Inner_Class.sayIamLocal");
            }
        }

        Local_Inner_Class local_inner_class = new Local_Inner_Class();
        local_inner_class.sayIamLocal();
    }

    public void sayHi() {
        System.out.println("Nested_classes.sayHi");
    }

    static class Static_Nested_Class {
        public void sayVoila() {
            System.out.println("The_Static_Nested_Class.sayVoila");
        }
    }
}

class Outer_Class {

    public void sayHello() {
        System.out.println("Outer_Class.sayHello");
    }

    static class Static_Nested_Class_Inside_Outer_Class {
        public void sayMorning() {
            System.out.println("Outer_Class.Static_Nested_Class_Inside_Outer_Class.sayMorning");
        }
    }
}

interface Outer_Interface {

    class Inner_Class_Inside_Interface {

        public void sayElo() {
            System.out.println("Outer_Interface.Inner_Class_Inside_Interface.sayElo");
        }
    }
}

final class FinalOuterClass {

    class InnerClass {

    }
}