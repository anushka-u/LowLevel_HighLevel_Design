package AbstractFactoryPattern.WithAFP;

public class Application {

    private  Button button;

    private Scroll scroll;

    public Application(UIFactory uiFactory){
        this.button = uiFactory.createButton();
        this.scroll = uiFactory.createScrollBar();
    }

    public  void render(){
        button.render();
    }

    public void scroll(){
        scroll.scroll();
    }

    /**
     *
     * this will solve our isssue of tight coupling and creatibng differenet button and scrollbar
     * now we cannot create button of windows and scrollbar of macOS , it will take UIFactory object and will create button and scrollbar of the UIFactory we will be
     * passing.
     */
    public static void main(String[] args) {
        UIFactory windowFactory = new WindowsFactory();
        Application app = new Application(windowFactory);

        app.render();
        app.scroll();
    }
}
