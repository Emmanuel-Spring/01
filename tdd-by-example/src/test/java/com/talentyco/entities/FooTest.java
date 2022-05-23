package com.talentyco.entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FooTest {

    @Test
    void get_foo_test() {
        Foo foo = new Foo();
        String result = foo.getFoo();

        assertEquals("FooBar", result);
    }
}