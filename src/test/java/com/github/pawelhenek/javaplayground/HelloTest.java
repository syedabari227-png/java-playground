package com.github.pawelhenek.javaplayground;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloTest {

    private Hello hello;

    @BeforeEach
    public void init() {
        hello = new Hello();
    }

    @Test
    void justAnExample() {
        assertEquals(hello.saySomething(), "something");
    }
}
