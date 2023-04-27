package ua.lviv.iot.algo.part1.lab5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RedactorTest {
    public static final String EXPECTED_STRING = "I like with I";
    public static final String TEST_STRING = "As programmer I like working with computers I Kyle";

    @Test
    public void redactorTest() {
        Redactor redactor = new Redactor();

        assertEquals(EXPECTED_STRING,redactor.toRedact(TEST_STRING));
    }

    @Test
    public void noNecessaryLettersTest() {
        Redactor redactor = new Redactor();
        String expectedStringWithoutNecessaryLetters = "HeRe no letteRs";

        assertEquals(expectedStringWithoutNecessaryLetters,redactor.toRedact(expectedStringWithoutNecessaryLetters));
    }

    @Test
    public void redactorClearStringTest() {
        Redactor redactor = new Redactor();
        String expectedString = "";
        String testString = "";

        assertEquals(expectedString,redactor.toRedact(testString));
    }
}
