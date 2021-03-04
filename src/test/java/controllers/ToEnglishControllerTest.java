package controllers;

import models.MorseCodeChart;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ToEnglishControllerTest {

    MorseCodeChart morseCodeChart = new MorseCodeChart();
    ToEnglishController toEnglishController = new ToEnglishController();

    @BeforeEach
    public void setUp() {
        morseCodeChart.morseChart();
    }

    //First test written after input of the Morse Code Library
    //To see that it fail if wrong character is used
    @Test
    @DisplayName("shouldFailShowMorse-...B")
    public void shouldSFailShowMorse() {
        char result = toEnglishController.toEnglish("....");
        String expected = "B";
        Assertions.assertNotEquals(expected, Character.toString(result));
    }

    //Second test. To see that empty space between morse characters fails if we put in empty char ' '
    @Test
    @DisplayName("ShouldFailShowEmptySpace")
    public void shouldFailShowEmpty() {
        char result = toEnglishController.toEnglish("' '");
        String expected = " ";
        Assertions.assertEquals(expected, Character.toString(result));
    }

    //Third test. Same as above but with working space in between characters.
    @Test
    @DisplayName("ShouldShowEmptySpace")
    public void shouldShowEmpty() {
        char result = toEnglishController.toEnglish(" ");
        String expected = " ";
        Assertions.assertEquals(expected, Character.toString(result));
    }

    @Test
    @DisplayName("shouldShowMorse....")
    public void shouldShowMorse() {
        char result = toEnglishController.toEnglish("....");
        String expected = "H";
        Assertions.assertEquals(expected, Character.toString(result));
    }

    //Test full sentence from Morse to English
    @Test
    public void shouldPrintWholeEnglishSentence() {

        String morseInput = ".... . .-.. .-.. --- _ .-- --- .-. .-.. -..".toUpperCase(Locale.ROOT);
        String[] splitString = morseInput.split(" ", 0);
        for (String english : splitString) {
            char expected = toEnglishController.toEnglish(english);
            assertEquals(expected, toEnglishController.toEnglish(english));
        }
    }
}