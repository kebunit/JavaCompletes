package kebunit.basic;

/**
 *
 * @author Sabituddin Bigbang
 * @since 2019
 *
 */

public class OverloadingVsOverriding {
    public static void main(String[] args) {
        // Overloading
        Aritmatika a1 = new Aritmatika(4, 6);
        Aritmatika a2 = new Aritmatika(10);
        System.out.println(a1.sumAngka());
        System.out.println(a2.sumAngka());
        System.out.println(a1.sum(3,4,6,7,8));
        System.out.println(a1.sum(3,4,6,7));
        System.out.println(a1.sum(3,4,6));
        System.out.println(a1.sum(3,4));

        // Overriding
        Bapak anaknyBapak = new Anak();
        System.out.println("Tabungan : " + anaknyBapak.tabungan());
    }

}

// Overloading
class Aritmatika {
    private int angka1;
    private int angka2;

    // constructor Overloading
    public Aritmatika(int angka) {
        angka1 = angka;
        angka2 = 10;
    }

    public Aritmatika(int angka1, int angka2) {
        this.angka1 =angka1;
        this.angka2 = angka2;
    }

    // method overloading
    public int sum(int a1, int a2) {
        return a1 + a2;
    }

    public int sum(int a1, int a2, int a3) {
        return a1 + a2 + a3;
    }

    public int sum(int a1, int a2, int a3, int a4) {
        return a1 + a2 + a3 + a4;
    }

    public int sum(int a1, int a2, int a3, int a4, int a5) {
        return a1 + a2 + a3 + a4 + a5;
    }

    public int sumAngka() {
        return angka1 + angka2;
    }
}


// Overriding
class Bapak {
    public int tabungan() {
        return 1000;
    }
}

class Anak extends Bapak {
    public int tabungan() {
        return 5000;
    }
}
