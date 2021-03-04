package controllers;

import models.MorseCodeChart;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static views.ConsoleColors.*;

public class ToEnglishController {
    public static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public void ToEnglishService() throws IOException {

        System.out.println("Type in your morse code. Use a \" _ \" (underscore) between words");
        String morseInput = bufferedReader.readLine();
        String[] splitString = morseInput.split(" ", 0);
        for (String english : splitString) {

            if (english.equals("_")) {
                System.out.print(Purple_Bg + toEnglish(english) + RESET + " ");

            } else {
                System.out.print(toEnglish(english));
            }
        }
    }

    //Chart Translator
    public char toEnglish(String english) {
        try {
            return MorseCodeChart.morseToEnglish.get(english);
        } catch (Exception exception) {

            System.out.println(Red_Bold + "\nError - Morse characters is only using . and - " + RESET);
            System.out.println(Red_Bold + "Don't forget to add _ (space+underscore+space) between words" + RESET);
            return ' ';
        }
    }
}
