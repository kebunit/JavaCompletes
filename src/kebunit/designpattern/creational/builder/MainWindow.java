package kebunit.designpattern.creational.builder;

public class MainWindow {
    private Menu menu;
    private Toolbar toolBar;

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public Toolbar getToolBar() {
        return toolBar;
    }

    public void setToolBar(Toolbar toolBar) {
        this.toolBar = toolBar;
    }
}

