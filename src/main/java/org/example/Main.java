package org.example;

public class Main {
    public static void main(String[] args) {

        // creating plain ice cream
        IceCream iceCream = new BaseIceCream();
        // adding sprinkles
        iceCream = new Sprinkles(iceCream);
        // adding peanut
        iceCream = new Peanut(iceCream);
        // adding M&M
        iceCream = new MandMDecorator(iceCream);

        // final result

        System.out.println(iceCream.description());
    }
}