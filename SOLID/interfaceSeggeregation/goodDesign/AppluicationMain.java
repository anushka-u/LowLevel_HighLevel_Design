package interfaceSeggeregation.goodDesign;

import interfaceSeggeregation.badDesign.MultiPurposePrinter;

public class AppluicationMain {

    public static void main(String[] args) {
        SinglePurposePrinter spp = new SinglePurposePrinter();
        spp.print();

        MultiPurposePrinter mpp = new MultiPurposePrinter();
        mpp.copy();
        mpp.scan();
        mpp.print();
    }
}
