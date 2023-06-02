package org.example;

public class Peanut extends IceCreamDecorator{


    public Peanut(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String description() {
        return getIcecream().description() + "{Peanut}";
    }
}
