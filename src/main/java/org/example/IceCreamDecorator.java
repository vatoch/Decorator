package org.example;

public abstract class IceCreamDecorator implements IceCream{

    private IceCream icecream;

    public IceCreamDecorator(IceCream icecream) {
        this.icecream = icecream;
    }

    public IceCream getIcecream() {
        return this.icecream;
    }
}
