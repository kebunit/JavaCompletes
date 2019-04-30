package kebunit.basic;

/**
 *
 * @author Sabituddin Bigbang
 * @since 2019
 *
 */

public class Loop {
    // member
    private String[] array = {"satu", "dua", "tiga", "empat", "lima", "enam", "tujuh", "delapan", "sembilan", "sepuluh"};

    // contructor
    public Loop() {}

    // getter and setter

    // methods
    public void forLoop() {
        for(int i = 0; i < 10; i++) {
            System.out.println("Saya tidak akan mengulangi lagi | forLoop()");
        }
    }

    public void forInfinitLoop() {
        int i=0;
        for( ; ; ) {
            if(i >= 10) {
                System.out.println("STOP Infinite Loop with break");
                break;
            }
            System.out.println("Saya tidak akan mengulangi lagi | forInfiniteLoop()");
            i++;
        }
    }

    public void forArrayLoop() {
        for(String item_array : array) {
            System.out.println(item_array + " | forArrayLoop()");
        }
    }

    public void whileLoop() {
        int i=0;
        while(i<10) {
            System.out.println("Saya tidak akan mengulangi lagi | whileLoop()");
            i++;
        }
    }

    public void doWhileLoop() {
        int i=0;
        do {
            System.out.println("Saya tidak akan mengulangi | doWhileLoop()");
            i++;
        } while(i<10);
    }

    public void whileInfiniteLoop() {
        int i=0;
        while(true) {
            if(i >= 10) {
                System.out.println("STOP Infinite Loop with break");
                break;
            }
            System.out.println("Saya tidak akan mengulangi lagi | whileInfiniteLoop()");
            i++;
        }
    }

    // Main Application
    public static void main(String[] args) {
        Loop loop = new Loop();
        loop.forLoop();
        loop.forArrayLoop();
        loop.forInfinitLoop();
        loop.whileLoop();
        loop.doWhileLoop();
        loop.whileInfiniteLoop();

    }

}
