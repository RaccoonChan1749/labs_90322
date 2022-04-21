package com.averkina;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    @DisplayName("test 1")
    void maxShape1() {
        Shape strategy[] = {new Triangle(100, 100), new Rectangle(100, 100), new Circle(10)};
        //5000 - 10000 - 314
        assertAll(() -> assertEquals(1, Main.maxShape(strategy)));
    }

    @Test
    @DisplayName("test 2")
    void maxShape2() {
        Shape strategy[] = new Shape[10];
        assertAll(() -> assertEquals(-1, Main.maxShape(strategy)));
    }
}