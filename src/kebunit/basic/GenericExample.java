package kebunit.basic;

public class GenericExample<T> {
    private T variable;

    public GenericExample(T value) {
        this.variable = value;
    }

    public T getVariable() {
        return variable;
    }

    public void setVariable(T variable) {
        this.variable = variable;
    }

    public void printVariable() {
        System.out.println("Value : " + variable);
    }

    public static void main(String args[]) {
        GenericExample<String> genString = new GenericExample<>("Sabituddin Bigbang");
        genString.printVariable();

        GenericExample<Integer> genInteger = new GenericExample<>(1000);
        genInteger.printVariable();

        GenericExample<Double> genDouble = new GenericExample<>(10.0032);
        genDouble.printVariable();
    }
}