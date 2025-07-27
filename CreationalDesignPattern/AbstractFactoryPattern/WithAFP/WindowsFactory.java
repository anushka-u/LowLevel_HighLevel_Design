package AbstractFactoryPattern.WithAFP;

public class WindowsFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Scroll createScrollBar() {
        return new WindowsScrollbar();
    }
}
