package TemplateMethodPattern.WithTMP;

abstract class DataParser {

    //Template Method Pattern
    public final void parse(){
        openFile();
        parseData();
        closeFile();
    }

    protected void openFile(){
        System.out.println("Opening the file");
    }

    protected void closeFile(){
        System.out.println("Closing the File");
    }

    protected abstract void parseData();
}
