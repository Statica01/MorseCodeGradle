package views;

import static views.ConsoleColors.*;

public class StartMenuView {

    public void StartMenuOptions() {

        System.out.println(Green_Bold + "\nEnglish to Morse code & Morse code to English Translator" + RESET);
        System.out.println("Select a menu option: ");
        System.out.println("1. English to Morse Translation");
        System.out.println("2. Morse to English Translation");
        System.out.println("3. See a Morse Code Dictionary");
        System.out.println("4. Exit ");
    }
}
