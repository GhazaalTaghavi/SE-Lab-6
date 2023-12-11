package errorHandler;

/**
 * Created by Alireza on 6/28/2015.
 */

public class ErrorHandler {
    private static ErrorHandler instance;
    private boolean hasError;

    public boolean isHasError() {
        return hasError;
    }

    private ErrorHandler() {
        hasError = false;
    }

    public static ErrorHandler getInstance() {
        if (instance == null) {
            instance = new ErrorHandler();
        }
        return instance;
    }

    public void printError(String msg) {
        hasError = true;
        System.out.println(msg);
    }
    public boolean hasError() {
        return hasError;
    }
}
}
