package TemplateMethodPattern.WithTMP;

public class CSVParser extends DataParser {
    @Override
    protected void parseData() {
        System.out.println("Parsing the CSV Data");
    }
}
