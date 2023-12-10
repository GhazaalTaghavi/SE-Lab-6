package parser;

public class ParserFacade {
    private Parser parser;

    public ParserFacade() {
        parser = new Parser();
    }

    public void startParsing(java.util.Scanner sc) {
        parser.startParse(sc);
    }
}