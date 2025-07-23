package TemplateMethodPattern.WithoutTMP;

public class JSONParser {

    public void parse(){
        openFile();
        System.out.println("Parsing JSON File");
        closeFile();
    }

    private void openFile(){
        System.out.println("Opening the File");
    }

    private void closeFile(){
        System.out.println("Closing the File");
    }
}
