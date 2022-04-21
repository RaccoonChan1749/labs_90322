package com.averkina;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    @DisplayName("анна - true (1)")
    void isPalindrome11() {
        assertEquals(true, Main.isPalindrome01("анна"));
    }

    @Test
    @DisplayName("Анна - true (1)")
    void isPalindrome12() {
        assertEquals(true, Main.isPalindrome01("Анна"));
    }

    @Test
    @DisplayName("Тот - true (1)")
    void isPalindrome13() {
        assertEquals(true, Main.isPalindrome01("Тот"));
    }

    @Test
    @DisplayName("Кит - false (1)")
    void isPalindrome14() {
        assertEquals(false, Main.isPalindrome01("Кит"));
    }

    @Test
    @DisplayName("\"\" - false (1)")
    void isPalindrome15() {
        assertEquals(false, Main.isPalindrome01(""));
    }
    @Test
    @DisplayName("анна - true (2)")
    void isPalindrome21() {
        assertEquals(true, Main.isPalindrome02("анна"));
    }

    @Test
    @DisplayName("Анна - true (2)")
    void isPalindrome22() {
        assertEquals(true, Main.isPalindrome02("Анна"));
    }

    @Test
    @DisplayName("Тот - true (2)")
    void isPalindrome23() {
        assertEquals(true, Main.isPalindrome02("Тот"));
    }

    @Test
    @DisplayName("Кит - false (2)")
    void isPalindrome24() {
        assertEquals(false, Main.isPalindrome02("Кит"));
    }

    @Test
    @DisplayName("\"\" - false (2)")
    void isPalindrome25() {
        assertEquals(false, Main.isPalindrome02(""));
    }
}