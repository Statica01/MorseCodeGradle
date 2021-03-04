package controllers;

import models.MorseCodeChart;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Locale;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static views.ConsoleColors.RESET;
import static views.ConsoleColors.Red_Bold;

class ToMorseControllerTest {
    MorseCodeChart morseCodeChart = new MorseCodeChart();
    private final ToMorseController toMorseController = new ToMorseController();

    @BeforeEach
    public void setUp() {
        morseCodeChart.morseChart();
    }

    @Test
    @DisplayName("shouldShowAlphabetA")
    public void shouldShowAlphabet() {
        String result = toMorseController.toMorse('A');
        String expected = ".-";
        assertEquals(expected, result);
    }

    //
    @Test
    @DisplayName("shouldShowMorse .")
    public void shouldShowAlphabet_() {
        String result = toMorseController.toMorse(' ');
        String expected = "_";
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("shouldShowErrorMessage")
    public void shouldShowErrorMessage_() {
        String result = toMorseController.toMorse('!');
        String expected = Red_Bold + "\nUnknown character used" + RESET + Red_Bold
                + "\nError - learn the characters included in Morse Code dictionary" + RESET;
        assertNotEquals(expected, result);
    }

    //Full sentence from English to Morse
    @Test
    public void shouldPrintWholeSentenceParameters() {

        String englishInput = "Hello World".toUpperCase(Locale.ROOT);
        char[] toChar = englishInput.toCharArray();
        for (char morse : toChar) {
            String expected = toMorseController.toMorse(morse);

            assertEquals(expected, toMorseController.toMorse(morse));
        }
    }


    //To see that TreeMap order sorts correctly
    @Test
    public void sortToMorseDictionaryTest() {
        TreeMap<Character, String> englishToMorse = new TreeMap<>();

        englishToMorse.put('4', "....-");
        englishToMorse.put('L', ".-..");
        englishToMorse.put('1', ".----");
        englishToMorse.put('T', "-");
        englishToMorse.put('C', "-.-.");

        assertEquals("[1, 4, C, L, T]", englishToMorse.keySet().toString());
    }
}