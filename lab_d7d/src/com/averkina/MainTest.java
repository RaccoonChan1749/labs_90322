package com.averkina;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    @DisplayName("Averkina Zhenya - Ivanov Sergey")
    void compareTo1() {
        Person onePers = new Person("Averkina", "Zhenya", 25);
        Person twoPers = new Person("Ivanov", "Sergey", 45);

        assertAll(() -> assertEquals(8, twoPers.compareTo(onePers)));
    }

    @Test
    @DisplayName("Averkina Zhenya - Averkina Sergey")
    void compareTo2() {
        Person onePers = new Person("Averkina", "Zhenya", 25);
        Person twoPers = new Person("Averkina", "Sergey", 45);

        assertAll(() -> assertEquals(-7, twoPers.compareTo(onePers)));
    }

    @Test
    @DisplayName("Averkina Zhenya - Averkina Zhenya")
    void compareTo3() {
        Person onePers = new Person("Averkina", "Zhenya", 25);
        Person twoPers = new Person("Averkina", "Zhenya", 45);

        assertAll(() -> assertEquals(0, twoPers.compareTo(onePers)));
    }
}