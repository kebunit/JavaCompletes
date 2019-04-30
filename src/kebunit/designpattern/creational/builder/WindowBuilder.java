package kebunit.designpattern.creational.builder;

public class WindowBuilder {
    public static MainWindow createWindow() {
        MainWindow window = new MainWindow();
        Menu menu = new Menu();
        Toolbar toolBar = new Toolbar();
        window.setMenu(menu);
        window.setToolBar(toolBar);
        return window;
    }
}

