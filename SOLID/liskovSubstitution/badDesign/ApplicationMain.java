package liskovSubstitution.badDesign;

public class ApplicationMain {
/*
LSP is about behavioural correctness in inheritance hierarchies
It states that Client using the base type shouldn't break or get suprised when a derived type is used.
In this example Ostrich is a bird which doesn't fly but as it extends Bird class and throws
an exception which is a suprise to client abouth the behaviour and it breaks behaviour correctness of base class.
 */
    public static void main(String[] args) {
        Bird ostrich = new Ostrich();
        ostrich.eat();
        ostrich.fly();
    }
}
