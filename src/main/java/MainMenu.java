import controllers.StartMenuController;

import java.io.IOException;

public class MainMenu {

    public static void main(String[] args) throws IOException {

        var startMenu = new StartMenuController();
        startMenu.StartMenuService();
    }
}
