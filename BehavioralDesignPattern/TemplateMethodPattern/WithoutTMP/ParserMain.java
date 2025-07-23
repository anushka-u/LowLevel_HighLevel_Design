package TemplateMethodPattern.WithoutTMP;
/*
while the below code works fine we have duplicate method for opening and closing file
and there is also possibility that when we add a new parser we might forget the
basic method open and close which is same across all parsing.
So what we really want is to define the openFile() and closeFile() as part of template and we should be able
to pluging the specific parsing logic based on the kind of file we have, which can be achieved using template method
 */
public class ParserMain {

    public static void main(String[] args) {
        CSVParser csvParser = new CSVParser();
        JSONParser jsonParser = new JSONParser();

        csvParser.parse();
        jsonParser.parse();
    }
}
