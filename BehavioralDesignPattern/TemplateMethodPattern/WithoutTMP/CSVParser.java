package TemplateMethodPattern.WithoutTMP;

public class CSVParser {
    public void parse(){
        openFile();
        System.out.println("Parsing CSV file");
        closeFile();
    }

    private void openFile(){
        System.out.println("Opening the file");
    }

    private void closeFile(){
        System.out.println("Closing the file");
    }
}
