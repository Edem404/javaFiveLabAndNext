package ua.lviv.iot.algo.part1.lab5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RedactorTest {
    public static final String EXPECTED_STRING = "I like with I";
    public static final String TEST_STRING = "As programmer I like working with computers I Kyle";

    @Test
    public void redactorTestCorrectDelete() {
        Redactor redactor = new Redactor();

        assertEquals(EXPECTED_STRING,redactor.deleteWordsWithSomeLetters(TEST_STRING));
    }

    @Test
    public void noNecessaryLettersRedactTest() {
        Redactor redactor = new Redactor();
        String expectedStringWithoutNecessaryLetters = "HeRe no letteRs";

        assertEquals(expectedStringWithoutNecessaryLetters,redactor.deleteWordsWithSomeLetters(expectedStringWithoutNecessaryLetters));
    }

    @Test
    public void clearStringRedactTest() {
        Redactor redactor = new Redactor();
        String expectedString = "";
        String testString = "";

        assertEquals(expectedString,redactor.deleteWordsWithSomeLetters(testString));
    }
}