package kebunit.corelib;

/**
 *
 * @author Sabituddin Bigbang
 * @since 2019
 *
 */

// Exception class hierarchy
public class ExceptionExample extends Exception {
    private static final long serialVersionUID = 1L;

    public ExceptionExample() {
        super();
    }

    public ExceptionExample(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public ExceptionExample(String message, Throwable cause) {
        super(message, cause);
    }

    public ExceptionExample(String message) {
        super(message);
        System.out.println("[ERROR] : " + message);
    }

    public ExceptionExample(Throwable cause) {
        super(cause);
    }

    public static void main(String[] args) {
        iniExceptionHandler EH = new iniExceptionHandler(3);
        EH.tryBlockHandler();

    }

}

// Exception Handler
class iniExceptionHandler {
    private int number;

    public iniExceptionHandler(int nomor) {
        number = nomor;
    }

    public void tryBlockHandler() {
        try {
            System.out.println("Test number!!!");
            if(number != 10) {
                throw new ExceptionExample("Nilai tidak sama dengan 10");
            }
        } catch (ExceptionExample e) {
            e.printStackTrace();
        } finally {

        }
    }

}
