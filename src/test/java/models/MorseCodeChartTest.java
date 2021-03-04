package models;

import org.hamcrest.collection.IsMapContaining;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;

class MorseCodeChartTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    //test our Hashmap setup before building Morse Code Chart
    @Test
    void morseChartTest() {
        Map<Character, String> englishToMorse;
        englishToMorse = new HashMap<>();
        englishToMorse.put('A', ".-");
        englishToMorse.put('.', ".-.-.-");
        englishToMorse.put(' ', "_");

        Map<Character, String> expected;
        expected = new HashMap<>();
        expected.put('A', ".-");
        expected.put('.', ".-.-.-");
        expected.put(' ', "_");

        //Testing Equals
        assertThat(englishToMorse, is(expected));

    }

    @Test
    void morseChartContainsTest() {
        Map<Character, String> englishToMorse;
        englishToMorse = new HashMap<>();
        englishToMorse.put('A', ".-");
        englishToMorse.put('.', ".-.-.-");
        englishToMorse.put(' ', "_");

        Map<Character, String> expected;
        expected = new HashMap<>();
        expected.put('A', ".-");
        expected.put('.', ".-.-.-");
        expected.put(' ', "_");

        //Testing Contains
        assertThat(englishToMorse, IsMapContaining.hasEntry('A', ".-"));
        assertThat(englishToMorse, not(IsMapContaining.hasEntry('!', "!")));
    }
}