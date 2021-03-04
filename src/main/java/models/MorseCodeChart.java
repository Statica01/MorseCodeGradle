package models;

import java.util.HashMap;
import java.util.Map;


public class MorseCodeChart {


    public static Map<Character, String> englishToMorse;
    public static Map<String, Character> morseToEnglish;

    public void morseChart() {
        //reads the chart English to Morse
        englishToMorse = new HashMap<>();

        englishToMorse.put('A', ".-");
        englishToMorse.put('B', "-...");
        englishToMorse.put('C', "-.-.");
        englishToMorse.put('D', "-..");
        englishToMorse.put('E', ".");
        englishToMorse.put('F', "..-.");
        englishToMorse.put('G', "--.");
        englishToMorse.put('H', "....");
        englishToMorse.put('I', "..");
        englishToMorse.put('J', ".---");
        englishToMorse.put('K', "-.-");
        englishToMorse.put('L', ".-..");
        englishToMorse.put('M', "--");
        englishToMorse.put('N', "-.");
        englishToMorse.put('O', "---");
        englishToMorse.put('P', ".--.");
        englishToMorse.put('Q', "--.-");
        englishToMorse.put('R', ".-.");
        englishToMorse.put('S', "...");
        englishToMorse.put('T', "-");
        englishToMorse.put('U', "..-");
        englishToMorse.put('V', "...-");
        englishToMorse.put('W', ".--");
        englishToMorse.put('X', "-..-");
        englishToMorse.put('Y', "-.--");
        englishToMorse.put('z', "--..");

        englishToMorse.put('0', "-----");
        englishToMorse.put('1', ".----");
        englishToMorse.put('2', "..---");
        englishToMorse.put('3', "...--");
        englishToMorse.put('4', "....-");
        englishToMorse.put('5', ".....");
        englishToMorse.put('6', "-....");
        englishToMorse.put('7', "--...");
        englishToMorse.put('8', "---..");
        englishToMorse.put('9', "----.");

        englishToMorse.put('.', ".-.-.-");
        englishToMorse.put(',', "--..--");
        englishToMorse.put('?', "..--..");
        englishToMorse.put(' ', "_");

        //Reverse Chart above to read morse to English
        morseToEnglish = new HashMap<>();
        for (HashMap.Entry<Character, String> entry : englishToMorse.entrySet()) {

            morseToEnglish.put(entry.getValue(), entry.getKey());
        }
    }
}
