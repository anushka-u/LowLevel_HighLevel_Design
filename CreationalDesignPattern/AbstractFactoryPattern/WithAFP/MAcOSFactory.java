package AbstractFactoryPattern.WithAFP;

public class MAcOSFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new MACButton();
    }

    @Override
    public Scroll createScrollBar() {
        return new MacScrollBar();
    }
}
