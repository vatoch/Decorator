package org.example;

public class MandMDecorator extends IceCreamDecorator {

    public MandMDecorator(IceCream icecream) {
        super(icecream);

    }

    @Override
    public String description() {
        return getIcecream().description() + " {M&M} ";

    }

}
