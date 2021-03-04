package controllers;

import models.MorseCodeChart;
import views.StartMenuView;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static views.ConsoleColors.*;


public class StartMenuController implements KeyListener {
    public static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public void StartMenuService() throws IOException {

        int select;
        StartMenuView startMenuView = new StartMenuView();
        ToMorseController toMorseController = new ToMorseController();
        ToEnglishController toEnglishController = new ToEnglishController();
        MorseCodeChart morseCodeChart = new MorseCodeChart();

        while (true) {

            morseCodeChart.morseChart();
            startMenuView.StartMenuOptions();

            try {
                select = Integer.parseInt(bufferedReader.readLine());
            } catch (Exception e) {
                select = 0;
            }

            switch (select) {
                case 1 -> toMorseController.ToMorseService();
                case 2 -> toEnglishController.ToEnglishService();
                case 3 -> {
                    toMorseController.sortToMorseDictionary();
                    char morse = 0;
                    toMorseController.toMorse(morse);
                }
                case 4 -> System.exit(0);

                default -> System.out.println(Red_Bold
                        + "Wrong choice, select one of the numbers in the menu" + RESET);
            }
        }
    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
