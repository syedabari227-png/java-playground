package com.github.pawelhenek.javaplayground.ocp_professional.java_fundamentals;

import java.awt.*;
import java.awt.event.*;

class TestFrame extends Frame {
    String s = "Message";

    public static void main(String args[]) {
        TestFrame t = new TestFrame();
        Button b = new Button("press me");
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // wont compile cause nonstatic context
                //System.out.println("Message is " + s);
            }
        });
        t.add(b);
    }
}