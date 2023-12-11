import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import errorHandler.ErrorHandler;
import parser.ParserFacade;

public class Main {
    public static void main(String[] args) {
        ErrorHandler errorHandler = ErrorHandler.getInstance();
        ParserFacade parserFacade = new ParserFacade();
        try {
            // start parsing
            parserFacade.startParsing(new Scanner(new File("src/main/resources/code")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
