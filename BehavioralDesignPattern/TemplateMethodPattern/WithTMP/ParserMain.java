package TemplateMethodPattern.WithTMP;
/*
We are following the Template Method PAttern and solving the problems such as not repeating/duplicating same code and
also not voilating the DRY principle.
 */
public class ParserMain {
    public static void main(String[] args) {
        DataParser csvParser = new CSVParser();
        DataParser jsonParser = new JSONParser();

        csvParser.parse();
        jsonParser.parse();
    }
}
