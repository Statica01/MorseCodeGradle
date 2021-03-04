package controllers;

import models.MorseCodeChart;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import static models.MorseCodeChart.englishToMorse;
import static views.ConsoleColors.*;

public class ToMorseController {
    public static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public void ToMorseService() throws IOException {

        System.out.println("Type in english");
        String englishInput = bufferedReader.readLine().toUpperCase();
        char[] toChar = englishInput.toCharArray();
        for (char morse : toChar) {

            if (MorseCodeChart.englishToMorse.containsKey(morse)) {
                if (morse == ' ') {
                    System.out.print(Purple_Bg + toMorse(morse) + RESET + " ");

                } else {
                    System.out.print(toMorse(morse) + " ");
                }
            } else {
                System.out.print(Red_Bold + "\nUnknown character used" + RESET + Red_Bold
                        + "\nError - learn the characters included in Morse Code dictionary" + RESET);
            }
        }
    }


    //Chart Translator
    public String toMorse(char morse) {

        try {
            return MorseCodeChart.englishToMorse.get(morse);
            //In case of failure reading the hashmap chart we throw an exception
        } catch (Exception e) {
            return Red_Bold + "\nError: " + RESET + e;
        }
    }

    public void sortToMorseDictionary() {
        TreeMap<Character, String> toMorseValue = new TreeMap<>(englishToMorse);
        Set<Map.Entry<Character, String>> toMorseMap = toMorseValue.entrySet();

        System.out.println(Purple_Bold+ "English Morse Code Dictionary: " + RESET);
        for (Map.Entry<Character, String> sortedToMorse : toMorseMap) {
            if (sortedToMorse.getKey() == ' ') {
                System.out.println(Purple_Bg + sortedToMorse.getKey() + RESET
                        + " = " +
                        sortedToMorse.getValue() + " ");
            } else {
                System.out.println(sortedToMorse.getKey() + " = " + sortedToMorse.getValue());
            }
        }
        System.out.println(Purple_Ul + " Morse Code words separated with _ (underscore) will show "
                + Purple_Bg+ " " + RESET +
                Purple_Ul + " in the English characters" + RESET);
    }
}