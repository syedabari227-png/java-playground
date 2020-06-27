package com.github.pawelhenek.javaplayground.ocp_professional.java_fundamentals;

import static com.github.pawelhenek.javaplayground.ocp_professional.java_fundamentals.Title.MR;

enum Title {
    MR("Mr. "), MRS("Mrs. "), MS("Ms. ");
    private String title;

    private Title(String s) {
        title = s;
    }

    public String format(String first, String last) {
        return title + " " + first + " " + last;
    }
}

// wont compile
//class TestClass1 {
//    void someMethod()
//    {
//        System.out.println(Title.format("Rob", "Miller"));
//    }
//}

class TestClass_title1 {
    void someMethod() {
        System.out.println(Title.MR.format("Rob", "Miller"));
    }
}

class TestClass_title2 {
    void someMethod() {
        System.out.println(MR.format("Rob", "Miller"));
    }
}

// wont compile
//class TestClass {
//    void someMethod() {
//        Title.DR dr = new Title.DR("Dr. ");
//    }
//}

enum Title2 {
    DR;
    private Title t;
}

enum Title23 {
    DR;
    private Title t = Title.MR;
}

enum Title24 {
    DR;
    private Title t = Title.MR;

    public String format(String s) {
        return t.format(s, s);
    };
}