package AbstractFactoryPattern.WithoutAFP;

public class Application {

    /**IF we are creating a windowsButton then we should create a windowScrollbar along with it, which we are doing below
     * but let's say we create a MacScrollbar along with windowButton, which we can do here
     * but that will not be logically correct.and should not be created.
     * secondly another problem is tightcoupling, the application is tightly coupled with this classes
     * and also for MAC UI we will need to modify client code by adding the MAC UI in our application class
    */
    public static void main(String[] args) {
        WindowsButton button = new WindowsButton();
        WindowsScrollbar scrollbar = new WindowsScrollbar();
        button.render();
        scrollbar.scroll();
    }
}
