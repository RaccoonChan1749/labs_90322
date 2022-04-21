package com.averkina;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    @DisplayName("testSaveFile")
    void testSaveFile() {
        assertAll(
                () -> assertEquals("cat", MainTest.testSaveFile("cat")),
                () -> assertEquals("", MainTest.testSaveFile(""))
        );
    }

    @Test
    @DisplayName("testTimer")
    void testTimer() {
        assertAll(() -> assertEquals(2, MainTest.testTimer(2)));
    }

    @Test
    @DisplayName("testCal")
    void testCal() {
        assertAll(
                () -> assertEquals(0.25, MainTest.testCal(1,2)),
                () -> assertEquals(0.95, MainTest.testCal(2,5)),
                () -> assertEquals(0.675, MainTest.testCal(3,3))
        );
    }

    private static String testSaveFile(String name) {
        SaveFile sf = new SaveFile();
        Person pers = new Person(name);
        sf.serialize(pers, "archive/test.data");

        return ((Person) sf.deserialize("archive/test.data")).getFIO();
    }

    private static long testTimer(long second) {
        MyTimer timer = new MyTimer();
        timer.run();
        try {
            Thread.sleep(second * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        timer.stop();
        return timer.getSecond();
    }

    private static double testCal(int type, long second) {
        Person pr = new Person("Test");
        pr.addCal(type, second);
        return pr.getCal();
    }
}