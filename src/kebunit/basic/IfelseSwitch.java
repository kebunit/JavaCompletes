package kebunit.basic;

/**
 *
 * @author Sabituddin Bigbang
 * @since 2019
 *
 */

public class IfelseSwitch {
    // class member
    private int selector;

    // constructor
    public IfelseSwitch(int selector) {
        this.selector = selector;
    }

    // setter
    public void setSelector(int selected) {
        this.selector = selected;
    }

    // method
    public void ifElseStatement() {
        if(selector == 1) {
            System.out.println("Selected satu : " + selector);
        } else if (selector == 2) {
            System.out.println("Selected dua : " + selector);
        } else if (selector == 3) {
            System.out.println("Selected tiga : " + selector);
        } else if (selector == 4) {
            System.out.println("Selected empat : " + selector);
        } else {
            System.out.println("Selected yang lain : " + selector);
        }
    }

    public void switchStatement() {
        switch(selector) {
            case 1 : System.out.println("Selected satu : " + selector); break;
            case 2 : System.out.println("Selected dua : " + selector); break;
            case 3 : System.out.println("Selected tiga : " + selector); break;
            case 4 : System.out.println("Selected empat : " + selector); break;
            default : System.out.println("Selected yang lain : " + selector); break;
        }
    }

    // Main Application
    public static void main(String[] args) {
        IfelseSwitch statement = new IfelseSwitch(2);
        statement.ifElseStatement();
        statement.setSelector(8);
        statement.switchStatement();
    }

}
