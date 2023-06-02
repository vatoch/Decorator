package org.example;

public class Sprinkles  extends IceCreamDecorator{

    public Sprinkles(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String description() {
        return getIcecream().description() + " {Sprinkles} ";
    }
}
